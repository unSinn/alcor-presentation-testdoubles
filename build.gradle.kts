plugins {
    java
}

group = "ch.ma3"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("drewcarlson.coingecko:coingecko-jvm:0.1.6")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.1")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.8.1")
    testImplementation("org.hamcrest:hamcrest:2.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation("org.assertj:assertj-core:3.21.0")
        testImplementation("org.mockito:mockito-junit-jupiter:4.0.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}