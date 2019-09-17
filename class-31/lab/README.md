# Lab: Lambda

## Overview
AWS Lambda allows writing code that is triggered in the cloud, without thinking about maintaining servers. We'll use it today to automatically run some processing on image files after they're uploaded in TaskMaster.

## Resources

## Feature Tasks
- A user should be able to upload an image at any size, and have both the original size and a thumbnail size associated with the task in question.
    - When an image is uploaded to your S3 bucket, it should trigger a Lambda function. (That Lambda function may be written in any language.)
    - That function should create a 50x50 pixel thumbnail version of that image, and save it to another S3 bucket. It should do so with a predictable naming convention, so that your server and/or frontend know where that thumbnail image will be.

## Stretch Goals
* Update your lambda to also automatically generate a favicon-sized image on upload.
* Update your lambda to conditionally create a favicon (if the image has `favicon` in the name) or a thumbnail (if not).
*Figure out how to have a placeholder image return, if an image is requested that doesn't exist, or is still being processed. (Hint: look at [custom redirects](https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html#advanced-conditional-redirects).)

## Documentation
* In your `README.md` include:
    * a link to your deployed application.
    * a description of how to use your lambda.
    * a description of any issues you encountered during deployment of this lambda.

## Submission Instructions
* Continue working in your repository.
* Work on a non-master branch and make commits appropriately.
* Update your README.md file with the required documentation above.
* Create a pull request to your master branch with your work for this lab.
* Submit the link to that pull request on Canvas.

## Rubric
- 4 points: A lambda function that creates and saves image thumbnails whenever a new image is uploaded
- 1 point: Tasks fetched from the server show both full-size and thumbnail image URLs
- 1 point: README
