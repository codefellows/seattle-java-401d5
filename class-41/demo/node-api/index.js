'use strict';

const express = require('express');
const cors = require('cors');

const app = express();

app.use(cors());
app.use(express.json());

app.get('/', (req,res) => {
  res.status(200).send('Welcome to the jungle');
});

app.listen(8081, () => console.log('app up'));
