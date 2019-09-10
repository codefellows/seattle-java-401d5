# Dynamo DB Loader

## Setup Instructions
- Run `npm install`
- Make sure that you've installed the AWS Cli and have configured it with your AWS Key and Secret
- Edit the load.js file
  - Change the table name to match your Dynamo DB Table Name
  - Change the field names in the `params{}` object in the `createRecord()` function to match your data model fields.
- Run `node load.js ##` where ## is how many records you want to load to your table.
- Wi
