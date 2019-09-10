# Lab: Build an app using a cloud based NoSQL Database

## Overview

Today, you'll start building a new application called TaskMaster. It's a task-tracking application with the same basic goal as Trello: allow users to keep track of tasks to be done and their status. While we'll start today with a basic feature set, we will continue building out the capabilities of this application over time.

The reason we're starting small on this server is because the main focus for the rest of the course is not full-stack web development, but is instead to gain experience with different features of Cloud Development. Everything we build will have the added task of deployment using the cloud. Today, you'll get to use a remote NoSQL database as the data store for your application. As we continue to build out our skill with NoSQL, that structure of our data will be our main focus for future development on TaskMaster.

## Resources

### AWS
* [Installing the Elastic Beanstalk CLI](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/eb-cli3-install.html){:target="_blank"}
* [The AWS Java SDK](https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/welcome.html){:target="_blank"}
* [Integrating DynamoDB and Spring](https://www.baeldung.com/spring-data-dynamodb){:target="_blank"}
* [Using DynamoDB With Java](https://tech.smartling.com/getting-started-with-amazon-dynamodb-and-java-universal-language-850fa1c8a902){:target="_blank"}

## Setup

Create a new repo called `taskmaster` to hold your work on this series of labs. Within that repo, use the Spring Initializr to set up a new web app. Use the directions from the class demo and the Using DynamoDB With Java resource, linked above, to ensure you have the dependencies you need.

Verify your endpoints with Postman (or similar) to ensure they are working as expected

Ensure all access keys are utilized through environment variables, so no keys get exposed (eg: pushed to GitHub). 

## Feature Tasks

- A user should be able to make a `GET` request to `/tasks` and receive JSON data representing all of the tasks.
    - Each task should have a `title`, `description`, and `status`.
- A user should be able to make a `POST` request to `/tasks` with body parameters for `title` and `description` to add a new task.
    - All tasks should start with a status of `Available`.
    - The response to that request should contain the complete saved data for that task.
- A user should be able to make a `PUT` request to `/tasks/{id}/state` to advance the status of that task.
    - Tasks should advance from `Available` -> `Assigned` -> `Accepted` -> `Finished`.
- A user should be able to access this application on the Internet.
    - The application should be deployed to EC2, with the database on DynamoDB.
    - You should also use DynamoDB for your local application testing; in other words, you should connect to your production database, even in your development environment. (This is generally a bad practice, and we'll see how to work differently soon.)

## Stretch Goals
- Put your application at a custom domain or sub-domain.
- A user should be able to make a `DELETE` request to `/tasks/{id}` to delete a task.

## Documentation
* In your `README.md` include:
    * a description of the TaskMaster application.
    * a link to your deployed application.
    * a description of any issues you encountered during deployment.

## Submission Instructions
* Work in your new `taskmaster` repository.
* Work on a non-master branch and make commits appropriately.
* Deploy your application.
* Update your README.md file with the required documentation above.
* Create a pull request to your master branch with your work for this lab.
* Submit the link to that pull request on Canvas.

## Rubric
- 2 points: GET request is functional remotely
- 2 points: POST request is functional remotely
- 1 point: PUT request is functional remotely
- 1 point: README
