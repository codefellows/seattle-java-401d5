const AWS = require('aws-sdk');
AWS.config.update({region: 'us-west-2'});

// Expects event to be an object with a key of phoneNumber
exports.handler = async (event) => {

  const sns = new AWS.SNS();

  const params = {
    Protocol: 'sms',
    TopicArn: 'arn:aws:sns:us-west-2:335083857671:TaskComplete',
    Endpoint: event.phoneNumber,
    ReturnSubscriptionArn: true || false
  };


  const data = await sns.subscribe(params).promise()

  const response = {
    statusCode: 200,
    body: JSON.stringify(data),
  };

  return response;
};
