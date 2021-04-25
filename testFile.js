const chalk = require('chalk');
var file = require("fs");

console.log(chalk.cyan.underline('\nWelcome to the Console\n'));

file.readFile('books.txt', function(err, data){
  if(err){
    console.log(chalk.bold.underline('\nStopping an error has occured:\n'));
    console.log(chalk.red(err.stack));
  }
  console.log(chalk.yellow.bold.underline('Successfully Reading from File:'));
  console.log(chalk.green(data.toString()));
});
