# Lab: A Static Frontend for TaskMaster

## Overview

JSON is cool and all, but humans struggle with understanding it. Let's admit our human failings by creating a web frontend with React to view this data in a more user-friendly way. 🤖

## Resources
* [The AWS Java SDK](https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/welcome.html){:target="_blank"}
- [Configure S3 for Static Sites](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/static-website-hosting.html){:target="_blank"}

## Setup

Create a new repo `taskmaster-frontend` to hold your React app. Use `create-react-app` to generate a React app there.

For any necessary backend changes, continue working in your `taskmaster` repo, deployed via Elastic Beanstalk.

## Feature Tasks

- A user should be able to visit the homepage of your React app and see the list of all tasks available in the database.
- React should be well-factored into at least 2 components. 
- The homepage should have reasonable styling and layout. (Nothing too fancy, but it shouldn't make the user cringe.)
- A user should be able to find that homepage on the Internet, deployed as a static site using S3.

## Stretch Goals
- A user should be able to advance the status of a task by clicking a button.
- A user should be able to filter the displayed tasks by assigned user.
- A user should be able to filter the displayed tasks by status.
- A user should be able to create a new task.

## Documentation
* In your `README.md` for your frontend repo, include:
    * a description of the application and its features
    * a screenshot of the application
    * a link to the deployed application on S3
    * a link to the backend repo

## Submission Instructions
* Work in your `taskmaster-frontend` repository, with updates in your `taskmaster` repository as necessary.
* Work on a non-master branch and make commits appropriately.
* Make sure the most recent version of your React app is deployed to S3.
* Update your README.md file with the required documentation above.
* Create a pull request to your master branch with your work for this lab.
* Submit the link to that pull request on Canvas.

## Rubric
- 2 points: React app displays tasks, is reasonably styled
- 3 points: React app is statically deployed to S3
- 1 point: README
