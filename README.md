# Spring Native Multi Module

This is an example application.

## Working

````groovy
// application/build.gradle

plugins {
    id 'java'
    id 'org.springframework.boot'
    id 'io.spring.dependency-management'
//    id 'org.springframework.experimental.aot'
}
````

and then execute

````bash
./gradlew bootRun
````

## Not Working

````groovy
// application/build.gradle

plugins {
    id 'java'
    id 'org.springframework.boot'
    id 'io.spring.dependency-management'
    id 'org.springframework.experimental.aot'
}
````

and then execute

````bash
./gradlew bootBuildImage
docker run --rm -p 8080:8080 application:1.0-SNAPSHOT
````
