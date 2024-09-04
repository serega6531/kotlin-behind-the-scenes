plugins {
    kotlin("jvm") version "2.0.20"
}

group = "berlin.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0-RC.2")
}

kotlin {
    jvmToolchain(21)
}