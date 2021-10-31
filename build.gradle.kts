plugins {
    java
}

group = "ch.ma3"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.7.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.8.1")
    testImplementation("org.hamcrest:hamcrest:2.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
    testImplementation("org.assertj:assertj-core:3.20.2")
    testImplementation("org.mockito:mockito-junit-jupiter:4.0.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}