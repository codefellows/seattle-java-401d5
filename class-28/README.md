# Cloud Storage Basics

## Agenda

- Announcements
- Code review
- Lecture
- Lab intro

## S3 Deployment
* Largely manual process
* Create "bucket" (akin to a "folder")
* Give open permissions to the bucket
* Turn on website hosting (under "Properties")
* Upload files ("objects") manually

## Scripted S3 Deployments
* Using the aws cli, you can sync any folder to your S3 bucket
  * `aws s3 sync [FOLDER] s3://[BUCKET] --acl public-read`
  * Replace `[FOLDER]` with the folder you want to upload to S3
  * Replace `[BUCKET]` with the bucket you want to upload to.
* If you're building a react app, you can use that command line as part of a `package.json` script, i.e.

  ```
  "scripts": {
     "deploy": "npm run build && aws s3 sync ./build s3://[BUCKET] --acl public-read"
  }   
  ``` 
  
## Cloudfront Deployment (though Cloud Formation)
 * Connects your React App, hosted at Github to Cloudfront
 * [npm aws pipeline tool](https://www.npmjs.com/package/@johnfellows/aws-tools)
 * Read the docs!
 * Uploads a .yml file to Cloud Formation
   * Creates AWS Resources:
     * Code Build Pipleline
     * Code Deploy Project
     * S3 Buckets to store your build files
     * Cloudfront connections to the S3 bucket
   * Responds to any master branch commit

## Amplify Deployment

With amplify, you simply follow the prompts to connect your react app and have the build script run for you, and cloud deployed. 

## CORS

You were asked to setup your API to allow for `cors` ... why?

* This can be used to restrict access to your API from clients on other domains.
  * e.g. If your API is at `http://api.domain.com` an a website at `http://www.somesite.com` tries to access your API, you can use a "cors" restriction policy to forbid them access.
  * Note that even `http://www.domain.com` is seen as a violator
  * This is turned on by default
  * Without addressing this setting on your API, your React app may not be able to get/post data
