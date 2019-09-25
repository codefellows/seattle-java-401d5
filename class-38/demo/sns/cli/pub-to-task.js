'use strict';

const AWS = require('aws-sdk');
AWS.config.update({region: 'us-west-2'});
var sns = new AWS.SNS();

const params = {
  Message: 'Hi, John!',
  TopicArn: 'arn:aws:sns:us-west-2:335083857671:TaskComplete',
};

sns.publish(params).promise().then( data => console.log(data) ).catch(console.error);
