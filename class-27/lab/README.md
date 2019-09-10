# Lab: Add Projects to TaskMaster

## Overview

There are too many tasks on TaskMaster! Users are struggling to view only the tasks relevant to them. Today, you'll allow users to assign tasks, and to view the tasks assigned to a user.

## Resources
* [The AWS Java SDK](https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/welcome.html){:target="_blank"}
- [Integrating DynamoDB and Spring](https://www.baeldung.com/spring-data-dynamodb){:target="_blank"}

## Setup

Continue working in your `taskmaster` repo. Use as many DynamoDB features as you can, to make your queries as efficient as possible. 

## Feature Tasks

- A user should be able to make a `GET` request to `/tasks` and receive JSON data representing all of the tasks.
    - Each task should have a `title`, `description`, `assignee`, and `status`, all of which are strings, as well as an `id`.
- A user should be able to make a `GET` request to `/users/{name}/tasks` and receive JSON data representing all of the tasks assigned to that user.
    - This should work (i.e. return an empty array) if the requested username does not have any assigned tasks.
- A user should be able to make a `POST` request to `/tasks` with body parameters for `title`, `description`, and `assignee` to add a new task.
    - A task should start with a status of `Available` if there is no assignee, and `Assigned` if there is an assignee.
    - The response to that request should contain the complete saved data for that task.
    - It should not matter whether or not that assignee is already in the database.
- A user should be able to make a `PUT` request to `/tasks/{id}/state` to advance the status of that task.
    - Tasks should advance from `Available` -> `Assigned` -> `Accepted` -> `Finished`.
- A user should be able to make a `PUT` request to `/tasks/{id}/assign/{assignee}` to assign a particular user to a task.
    - Changing the assignee should set the task's state to `Assigned`.
    - This should work whether or not that assignee name is already in the database.
- A user should be able to access this application on the Internet.
    - The application should be deployed to EC2, with the database on DynamoDB.
    - You should also use DynamoDB for your local application testing; in other words, you should connect to your production database, even in your development environment. (This is generally a bad practice, and we'll see how to work differently soon.)

## Stretch Goals
- Put your application at a custom domain or sub-domain.
- A user should be able to make a `DELETE` request to `/tasks/{id}` to delete a task.
- A user should be able to make a `GET` request to `/users/{name}/tasks?status=assigned` to receive JSON data representing all of the tasks assigned to that user that are not in the `Assigned` state.
- A user should be able to make a `GET` request to `/tasks?status=available` to receive JSON data representing all of the available (unassigned) tasks.
- That `status` query parameter should be extended to work with all statuses and all `GET` requests.
- And should allow comma-separated values, i.e. `?status=assigned,accepted`.

## Documentation
* In your `README.md` include a changelog with the updates you've made today.

## Submission Instructions
* Continue working in your `taskmaster` repository.
* Work on a non-master branch and make commits appropriately.
* Make sure the most recent version of your app is deployed.
* Update your README.md file with the required documentation above.
* Create a pull request to your master branch with your work for this lab.
* Submit the link to that pull request on Canvas.

## Rubric
- 2 points: GET request is functional on EC2/DynamoDB
- 2 points: POST request is functional on EC2/DynamoDB
- 1 point: PUT request is functional on EC2/DynamoDB
- 1 point: README
