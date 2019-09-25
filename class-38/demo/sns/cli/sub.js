const AWS = require('aws-sdk');
AWS.config.update({region: 'us-west-2'});
const sns = new AWS.SNS();

var params = {
  Protocol: 'sms',
  TopicArn: 'arn:aws:sns:us-west-2:335083857671:TaskComplete',
  Endpoint: '+12062764309',
  ReturnSubscriptionArn: true || false,
};

sns.subscribe(params).promise()
  .then( data => console.log('OK', data) )
  .catch( console.error );


