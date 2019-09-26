# LAB: Dynamic Notifications

For this assignment, you will be wiring an SNS Topic and Lambda functions into your Taskmaster application

### Before you begin

**Verify** that your previous lab requirements are complete. You should have:

* An SNS Topic called "TaskComplete"
* A Lambda function (called `taskmasterSubscribe`) that can add an SMS subscriber to that Topic via a parameter (on the inbound `event` object)
* A Lambda function (called `taskmasterPublish`) that sends a message to the `TaskComplete` topic 
  * Messages sent from this Lambda function are received via text 
* A Lambda function that runs on every write operation in your Dynamo DB Table

### Add Notifications to TaskMaster Cloud
* Create an API Gateway endpoint that accepts a POST containing a Phone Number in the JSON sent into it's body
  * This route should run the `taskmasterSubscribe` lambda function, allowing anyone to subscribe to the `TaskComplete` SNS Topic
* Refactor the Lambda function that handles the "write" operations on the Dynamo Database
  * When it fires, if the operation has marked the task as "Completed" ...
    * Instead of just logging that activity ...
    * It should send a message to the `TaskComplete` topic with text to indicate that the task has been completed.
* Update your React application with a form that allows the user to enter their phone number so that they can be notified when tasks are completed
  * This should POST to your new API route and subscribe the user
  
#### Feature Requirements / User Validation
* React Application where ...
* Users can create tasks
* Users can upload images
* Users can re-assign tasks to other users
* Users can enter their phone number to subscribe to completed notifications
* Users can mark tasks as completed
* When tasks are marked as complete
  * Dynamo triggers a lambda function
  * That lambda function sends a message to SNS
  * SNS Broadcasts that message to all subscribers, sending a text message

#### Stretch Goals
* Offer your users a new API route and a link on the React app that would allow them to **unsubscribe** from notifications

#### Documentation Requirements
* A link to your running, deployed React application
* A full data flow / UML style diagram of the application
* Creation/Setup Steps
* Running/Operating Instructions
