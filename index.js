'use strict';

const express = require('express');
const morgan = require('morgan');

// App
const app = express();
app.use(morgan('common'));

app.get('/', (req, res) => {
  res.send('Hello world\n');
});

module.exports = app;