# Lab: Lambda with Dynamo

## Overview

Let's use Lambda to handle database changes in real time!

## Feature Tasks

### Java Insert/Update Functionality
- Create a lambda function, in Java, that can add a record to your Taskmaster table.
- Run this only in "Test" mode
- It should receive the same object that your API was handling earlier.
- Repeat for "PUT" / update functionality
- Do NOT handle images at this point.

### Javascript or Python
- Create a lambda function that will handle a [Dynamo Event](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html)
  - Initial Task: Log out the deltas
  - Stretch Goal: Update the history!

### Setup a Dynamo Trigger
- Configure your DynamoDB Table to invoke your lambda function on database change operations.


## Documentation
* In your `README.md` include:
    * a link to your API Gateway.
    * a description of any issues you encountered during deployment.

## Submission Instructions

* Work on a non-master branch and make commits appropriately.
* Update your README.md file with the required documentation above.
* Create a pull request to your master branch with your work for this lab.
* Submit the link to that pull request on Canvas.

## Rubric
- 4 points: Lambda function is exposed at a RESTful endpoint
- 1 points: method is well-tested
- 1 points: README

