plugins {
    //id("java")
    application // заменяет id("java")
    //id("com.github.ben-manes.versions") version "0.54.0"
}


group = "hexlet.code"
version = "1.0-SNAPSHOT"

application { mainClass.set("hexlet.code.App") } //точка входа в приложение + в plugins строка

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}