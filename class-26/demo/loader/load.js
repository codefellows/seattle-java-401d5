'use strict';

require('dotenv').config();
const faker = require('faker');
const uuid = require('uuid/v4');
const AWS = require('aws-sdk');

AWS.config.update({
  region: 'us-west-2'
});

let dynamodb = new AWS.DynamoDB();
let ddbClient = new AWS.DynamoDB.DocumentClient();

const addRecord = (record) => {

  let params = {
    TableName: 'todo',
    Item: {
      'id': uuid(),
      'assigned': faker.name.firstName(),
      'complete': faker.random.boolean().toString(),
      'foobar': faker.name.lastName(),
      'stuff': [faker.name.firstName(), faker.name.lastName()]
    }
  };

  ddbClient.put(params, function(err,data) {
    if(err) { console.error(err); }
    else {
      //console.log('saved')
    }
  })

};

const recordsToAdd = parseInt( process.argv.slice(2)[0]) || 1;
for(let i = recordsToAdd; i > 0; i--) {
  console.log(`${i} records to go`)
  addRecord();
}
