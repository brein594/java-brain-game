plugins {
    //id("java")
    application // заменяет id("java")
    //id("com.github.ben-manes.versions") version "0.54.0"
    checkstyle
    id("org.sonarqube") version "6.0.1.5171"
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

//стандарный поток ввода
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

checkstyle {
    toolVersion = "10.12.4"
}

sonar {
    properties {
        property("sonar.projectKey", "brein594_java-brain-game")
        property( "sonar.organization", "brein594")
        property( "sonar.host.url", "https://sonarcloud.io")
    }
}