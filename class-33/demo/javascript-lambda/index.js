const uuid = require('uuid/v4');
const AWS = require('aws-sdk');
const parser = require('lambda-multipart-parser');

// Our connections
AWS.config.update({ region: 'us-west-2' });

const dynamodb = new AWS.DynamoDB();
const ddbClient = new AWS.DynamoDB.DocumentClient();

exports.handler = async (event, context) => {

  // What came into us as the event?
  // Checkout event.body ... it's a base64 encoded blob that has
  // the multipart form stuff in it.  You can do an atob() on it
  // to witness the full txt/binary body.
  console.log('EVENT', event)

  // Construct an Object to send out to Dynamo
  let params = {
    TableName: 'people',
    Item: {
      id: uuid(),
      name: event.name,
      old: event.old,
    }
  };

  const data = await ddbClient.put(params).promise();
    return {
      statusCode: 200,
      body: JSON.stringify(data)
    }
};
