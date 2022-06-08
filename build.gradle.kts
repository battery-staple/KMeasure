plugins {
    kotlin("multiplatform") version "1.6.21"
    `maven-publish`
    signing
}

group = "io.github.battery-staple"
version = "1.0.2"

repositories {
    mavenCentral()
}

val environment = System.getenv()

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
                println(environment["sonatypeUsername"].toString())
                println(environment["sonatypePassword"].toString())
                credentials {
                    username = "battery-staple"
                    password = "vp8kkcccga_@3P6tg2yNygfFx@XBWx-R2ALypBmxy4BVntz.@4o.Z7PrVXqBorp"
//                    username = environment["sonatypeUsername"].toString()
//                    password = environment["sonatypePassword"].toString()
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
//        val key = environment["signingKey"]?.toString()?.replace("\\n", "\n")
//        val password = environment["signingPassword"]?.toString()
        val key = """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
0ch789tjslcxig==
=SXFQ"""
        val password = "REVOLVER-flautist-rime-equinox-libyan-spaniel"

        println("Key: $key")
        println("Password: $password")
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
                freeCompilerArgs += "-Xallow-kotlin-package"
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
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

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
            kotlinOptions {
                freeCompilerArgs += "-Xallow-kotlin-package"
            }
        }
    }

//    val publicationsFromMainHost =
//        listOf(jvm(), js()).map { it.name } + "kotlinMultiplatform"
}

val emptyJavadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

val isReleaseBuild: Boolean
    get() = !(version as String).endsWith("SNAPSHOT")
