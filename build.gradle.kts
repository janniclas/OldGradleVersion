plugins {
    kotlin("jvm") version "1.9.21"
}

group = "iem.fraunhofer.de"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-api-kotlin:1.3.0")
    implementation("org.apache.logging.log4j:log4j-to-slf4j:2.21.1")
    implementation("ch.qos.logback:logback-classic:1.4.11")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}