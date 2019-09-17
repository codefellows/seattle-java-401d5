# Serverless Functions

Welcome to the world of "Serverless" computing!

## Agenda

- Announcements
- Code review
- Lecture
- Lab intro

## Serverless Functions In a nutshell
* Serverless = Micro Applications, Micro Architecture
* Event Triggered Code
* Targeted Code (Best language for the job)
* Strike teams (SME's don't have to integrate)
* Micro Scaling (Functions scale independently and as needed)

### Pro Tips ...

#### Args / Params
* Lambdas are called with 2 parameters
  * Event Data (will likely be complex)
  * AWS Context
  
#### Testing
* Invoked in the Lambda Console
* Simulated environments
* Simulated Input/Event args

#### Java Functions
* Java 1.8 (v8/52mv) required (add these to `build.gradle`)
  * `sourceCompatibility = 1.8`
  * `targetCompatibility = 1.8`
* Will need AWS dependencies (add these to `build.gradle`)
  * `compile 'com.amazonaws:aws-lambda-java-core:1.2.0'`
  * `compile 'com.amazonaws:aws-lambda-java-events:2.2.6'`
  * `compile 'com.amazonaws:aws-java-sdk:1.11.588'`

#### Uploading from CLI
* Package up your app into a zip/jar file
  * i.e. Entry point and all dependencies
* Upload/Update your function
`aws lambda update-function-code --function-name s3Test --zip-file fileb://function.zip`
