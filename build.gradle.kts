plugins {
    kotlin("multiplatform") version "1.7.0"
    `maven-publish`
    signing
}

group = "io.github.battery-staple"
version = "1.3.1"

repositories {
    mavenCentral()
}

val environment: MutableMap<String, String> = System.getenv() ?: error("Could not get environment")

afterEvaluate {
    extensions.findByType<PublishingExtension>()?.apply {
        repositories {
            maven {
                url = uri(
                    if (isReleaseBuild) {
                        "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                    } else {
                        "https://s01.oss.sonatype.org/content/repositories/snapshots/"
                    }
                )
                credentials {
                    username = environment["sonatypeUsername"].toString()
                    password = environment["sonatypePassword"].toString()
                }
            }
        }

        publications.withType<MavenPublication>().configureEach {
            artifact(emptyJavadocJar.get())

            pom {
                name.set("KMeasure")
                description.set("A low-overhead library adding units to Kotlin Multiplatform")
                url.set("https://github.com/battery-staple/KMeasure")

                developers {
                    developer {
                        name.set("Rohen Giralt")
                        email.set("batterystapledev@gmail.com")
                        organization {
                            name.set("None")
                            url.set("https://github.com/battery-staple/")
                        }
                    }
                }

                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://www.opensource.org/licenses/mit-license.php")
                        distribution.set("repo")
                    }
                }

                scm {
                    url.set("https://github.com/battery-staple/KMeasure")
                }
            }
        }
    }

    extensions.findByType<SigningExtension>()?.apply {
        val publishing = extensions.findByType<PublishingExtension>() ?: return@apply
        val key = environment["signingKey"]?.replace("\\n", "\n")
        val password = environment["signingPassword"]

        useInMemoryPgpKeys(key, password)
        sign(publishing.publications)
    }

    tasks.withType<Sign>().configureEach {
        onlyIf { isReleaseBuild }
    }
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
        testRuns["test"].executionTask.configure {
            useJUnit()
        }
    }
    js(LEGACY) {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    @Suppress("UNUSED_VARIABLE")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    @Suppress("UNUSED_VARIABLE")
    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
        val nativeMain by getting
        val nativeTest by getting
    }

    targets.all {
        compilations.all {
            @Suppress("SuspiciousCollectionReassignment")
            kotlinOptions {
                freeCompilerArgs += "-Xallow-kotlin-package"
            }
        }
    }
}

val emptyJavadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

val isReleaseBuild: Boolean
    get() = !(version as String).endsWith("SNAPSHOT")
