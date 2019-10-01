# Lab: CI/CD & Deployment Pipelines


## Overview
With your assigned group, implement and document a full CI/CD Pipeline 

## Feature Tasks

You will be assigned one of the following applications to deploy through a pipeline

- [Node Express Server](https://github.com/codefellows/deployment-app-node)
- [Java Spring Boot App](https://github.com/codefellows/deployment-app-java)
- [C# App](https://github.com/codefellows/deployment-app-csharp)
- [PHP App](https://github.com/codefellows/deployment-app-php)

Using only the instructions provided to you, implement a working CI/CD Pipeline

Once you have it working ...

Add a "Build" stage to your Pipeline which includes the following steps (depending on your app)

- Build
- Test

**DOCUMENT** the process for "future you" (or, more likely, another team)
  - Create a new repository for your documentation, called `doc-pipeline-app` (i.e. doc-pipeline-java)
  - Create a README.md 
  - Include step by step instructions
  - Screenshots or supplementary drawings where appropriate
  - Troubleshooting tips
    - Identify potential roadblocks or trouble spots
  - Provide a means of proving that the pipeline works
  - Provide a means of proving repeatability

## Stretch Goals

- Implement pipelines for multiple environments
  - Dev, Stage, Prod
- Do you want to tie each to its own branch?
- Do you want to have a master pipeline that gates subsequent environments?

## Submission Instructions

* Submit a link to a deployed application
* Submit a screenshot of a "green" pipeline to prove how you deployed it.
* Submit a link to your documentation.

## Rubric
- 3 points: Application is deployed through a CI/CD Pipeline
- 2 points: Documentation is present and complete
