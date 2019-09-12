# Lab: Programmatic S3 Uploads

## Overview

## Resources

## Feature Tasks
- Users should be able to upload images that are associated with tasks.
    - This ability should be at a route like `POST /tasks/{id}/images`. (This means it only needs to work for existing tasks, not as part of the initial creation of a task.)
    - Your server should programmatically upload this image to S3.
    - Your server should store the image URL (on S3) somewhere in its database, associated with the task.
    - Fetching a single task (at `GET /tasks/{id}`) should also include the image URLs associated with that image.

## Stretch Goals
- Allow adding images during the initial creation of a task.
- Add these features to your React frontend.

## Documentation
* In your `README.md` include:
    * a link to your deployed application.
    * a description of any issues you encountered during deployment.

## Submission Instructions
* Continue working in your repository.
* Work on a non-master branch and make commits appropriately.
* Update your README.md file with the required documentation above.
* Create a pull request to your master branch with your work for this lab.
* Submit the link to that pull request on Canvas.

## Rubric
- 2 points: Server has a route like `POST /tasks/{id}/images` that accepts image uploads
- 2 points: Image uploads to that route are saved in S3
- 1 point: Tasks and image URLs are appropriately associated; you can find uploaded images afterwards
- 1 point: README
