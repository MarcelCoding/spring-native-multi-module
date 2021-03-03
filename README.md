# Spring Native Multi Module
This is an example application.

## Not Working

````bash
./gradlew bootBuildImage
docker run --rm -p 8080:8080 application:1.0-SNAPSHOT
````

## Working
Comment out the following lines:
````groovy
// application/build.gradle

plugins {
    id 'java'
    id 'org.springframework.boot'
    id 'io.spring.dependency-management'
//    id 'org.springframework.experimental.aot'
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-autoconfigure'
//    implementation("org.springframework.experimental:spring-native:${springNativeVersion}") { changing true }

    implementation project(':library')

    annotationProcessor 'org.springframework.boot:spring-boot-configuration-processor'
}

bootBuildImage {
//    builder = "paketobuildpacks/builder:tiny"
//    environment = [
//            "BP_BOOT_NATIVE_IMAGE": "true"
//    ]
}

````
and then execute
````bash
./gradlew bootBuildImage
docker run --rm -p 8080:8080 application:1.0-SNAPSHOT
````
