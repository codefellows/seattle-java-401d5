# LAB: SQS & Lambda

## Overview

For this lab, you will be connecting SQS Message Queues to Lambda functions to perform tasks

## Getting Started

* Ensure that you have the following working pieces:
  * 3 Standard SQS Queues Created:
    * `QueueA`
    * `QueueB`
    * `QueueC`
  * A Java application that can publish "random" messages into those Queues.
  * Java application(s) that can pull messages from those Queues.
  * (Possibly) a React application that can also pull messages from those Queues.

## Feature Tasks

* Create Lambda functions that are triggered by each of the 3 Queues
* Write your functions in Javascript
  * They should perform the same task that your Java apps do
* Confirm that as you publish, you are seeing your app and the lambdas handle the queued messages at scale

### Stretch Goal

* Convert your Java Queue Clients into Lambdas and deploy them.
* You should be able to scale Queued messages equally between:
  * Node App (sqs-receive.js)
  * React App
  * JS Lambdas
  * Java Lambdas
  
**Engineering Note** -- Normally, we would have the same piece of code handling the distributed load. 4 types of code handling the same messages could lead to them being handled in non-conformant ways.  However, today your focus is to see and produce multiplicative wiring, and witness scale.
  

## Documentation
* Leave future you and your team detailed wiring and running instructions

## Submission Instructions

- Create a repo to hold your work for today.
- Do your work on a feature branch.
- Create a pull request to your master branch.
- Submit a link to that pull request on Canvas.

## Rubric
- 3 points: Single Queue Publisher and Receiver (sqs)
- 1 point: Tests
- 1 point: README
