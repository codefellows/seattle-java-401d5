# Lab: SQS - Message Queues

## Overview

For this lab, you will be creating a few Message Queues and Broadcasters and wiring them through code.

## Feature Tasks

* Create 3 Standard Queues 
  * `QueueA`
  * `QueueB`
  * `QueueC`
* Create command line applications in Java that use these queues
  * Queue Publisher
    * Sends a message to a queue, using its ARN or URL
  * Queue Client
    * Receives messages from a Queue (by ARN) and displays them
  * Food for thought ... 
    * Which library will you choose to connect to the SQS system?
    * How can you librarize your own solution so as not to be esoteric to a single application?
  

## Stretch Goals
* Have your publishers loop and send MANY messages
* Have your publishers and receivers work with dynamic queue names
  * i.e. through and environment variable instead of application properties

## Testing
* How will you test this code? 
* You may NOT test against the actual queues that you have created

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
