# Lambda with Dynamo

## Agenda

- Announcements
- Code review
- Lecture
- Lab intro

## Handling Dependencies

### Javascript

* Locally, install your dependencies (`npm install`)
* Deploy: Create a .zip file that includes your `node_modules` folder and upload to lambda

### Java

Simply sending your class (a simple function) will not work, as the environment your Lambda runs in does not have everything it needs.

This requires a "fatJar" or "fullZip" to work right. 

Sample build.gradle
```
plugins {
    // Apply the java-library plugin to add support for Java Library
    id 'java-library'
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api 'org.apache.commons:commons-math3:3.6.1'

    compile 'com.amazonaws:aws-lambda-java-core:1.2.0'
    compile 'com.amazonaws:aws-lambda-java-events:2.2.6'
    compile 'com.amazonaws:aws-java-sdk:1.11.588'
    compile 'com.amazonaws:aws-java-sdk-dynamodb:1.11.585'

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation 'com.google.guava:guava:28.0-jre'

    // Use JUnit test framework
    testImplementation 'junit:junit:4.12'
}

task buildZip(type: Zip) {
    from compileJava
    from processResources
    into('lib') {
        from configurations.runtimeClasspath
    }
}

build.dependsOn buildZip

//apply plugin: 'java'
sourceCompatibility = 1.8
targetCompatibility = 1.8
```
