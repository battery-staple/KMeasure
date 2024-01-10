
import kotlinx.benchmark.gradle.JvmBenchmarkTarget
import org.jetbrains.kotlin.konan.target.HostManager
import org.jetbrains.kotlin.konan.target.KonanTarget

plugins {
    kotlin("multiplatform") version "1.9.10"
    `maven-publish`
    signing
    id("org.jetbrains.kotlinx.benchmark") version "0.4.9"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.9.10"
}

group = "io.github.battery-staple"
version = "1.4.0"

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
        compilations {
            create("benchmark") { associateWith(compilations["main"]) }
            all {
                kotlinOptions {
                    jvmTarget = "1.8"
                }
            }
        }

        testRuns["test"].executionTask.configure {
            useJUnit()
        }
    }

    js {
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }

        nodejs()
    }

    if (HostManager.host == KonanTarget.MACOS_X64) macosX64("native")
    if (HostManager.host == KonanTarget.MACOS_ARM64) macosArm64("native")
    if (HostManager.hostIsLinux) linuxX64("native")
    if (HostManager.hostIsMingw) mingwX64("native")

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jvmBenchmark by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-benchmark-runtime:0.4.9")
            }
        }
        val jsMain by getting
        val jsTest by getting
        val nativeMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-benchmark-runtime:0.4.9")
            }
        }
        val nativeTest by getting
    }

    targets.all {
        compilations.all {
            kotlinOptions {
                freeCompilerArgs += "-Xallow-kotlin-package"
            }
        }
    }
}

// region Benchmarking config

allOpen {
    annotation("org.openjdk.jmh.annotations.State")
}

benchmark {
    configurations {
        named("main") {
            iterations = 5
            iterationTime = 5
            iterationTimeUnit = "sec"
            advanced("jvmForks", "definedByJmh")
            advanced("jsUseBridge", true)
            advanced("nativeGCAfterIteration", true)
        }
    }

    targets {
        register("jvmBenchmark") {
            this as JvmBenchmarkTarget
            jmhVersion = "1.37"
        }
        register("js")
        register("native")
    }
}

// endregion

val emptyJavadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

val isReleaseBuild: Boolean
    get() = !(version as String).endsWith("SNAPSHOT")

//region Fix Gradle warning about signing tasks using publishing task outputs without explicit dependencies
// https://github.com/gradle/gradle/issues/26091
// by aSemy on GitHub
tasks.withType<AbstractPublishToMaven>().configureEach {
    val signingTasks = tasks.withType<Sign>()
    mustRunAfter(signingTasks)
}
//endregion