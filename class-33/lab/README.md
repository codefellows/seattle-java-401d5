# Lab: Lambda with API Gateway

## Overview

In this lab, we will begin the task of migrating our application from a "monolithic" Java application into a truly cloud based application, with distributed functions, services, and events.


## Setup

* Create a new (empty) Lambda function for each route in Taskmaster
  * Get all Tasks
  * Get tasks for a user
  * Create New Task
  * Delete Task
  * Update Task State
  * Change Task Assignee
* Create a new API using AWS API Gateway
* Create a new resource `/tasks`
  * Create a new Resource + Method to match the taskmaster functionality
  * For each resource, point them at the proper Lambda function
    * GET `/tasks`
    * GET `/tasks/{user}`
    * POST `/tasks`
    * PUT `/tasks/{id}/state`
    * PUT `/tasks/{id}/assign/{assignee}`
    
## Feature Tasks

* Migrate the functionality of your Create, Update, and Delete methods in your original Taskmaster Java application to their matching Lambda functions.
* You may use any language to create these functions!
* These endpoints should work ONLY with JSON data or URL Params
* Taskmaster functionality must remain the same
  * **With the exception of History** (do not implement)
* Refactor your react application to send a JSON object to the server instead of raw form data

## Stretch Goals

* Create a new lambda function to handle image uploads
  * PUT `/tasks/{id}/image`
  * This should take Multipart/Form-Data from the React App
  * Likely, this is a separate form/action on the React Side...
* Connect a lambda function to a trigger on DynamoDB Writes
  * Whenever a write event happens, add an entry to the item's history 
  * Note: this itself is a write operation, so guard against an infinite loop!

## Documentation
* In your `README.md` include:
  * a link to your API Gateway.
  * supporting images/screenshots of your database records, images, etc.
  * a description of any issues you encountered during deployment.

## Submission Instructions

* Update your README.md file with the required documentation above.

## Rubric
- 4 points: Lambda function is exposed at a RESTful endpoint
- 1 points: method is well-tested
- 1 points: README

