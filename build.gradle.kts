plugins {
    id("java")
}

group = "com.kolohmatowa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.9.3")
    implementation("com.codeborne:selenide:6.16.0")

}

tasks.test {
    useJUnitPlatform()
}