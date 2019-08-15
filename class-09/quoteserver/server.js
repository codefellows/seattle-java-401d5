const express = require('express');
const app = express();

function Quote (body, author) {
    this.body = body;
    this.author = author;
}
const quotes = [
    new Quote('Fire destroys all sophistry, that is deceit; and maintains truth alone, that is gold.', 'Leonardo DaVinci'),
    new Quote('The Wonder of nature does not become smaller because one cannot measure it by the standards of human moral and human aims.', 'Albert Einstein'),
    new Quote('Always leave the campus a little better than you found it.',	'Brook Riggio 🚀'),
    new Quote('Always leave the whiteboard a little better than you found it.',	'Brook Riggio 🚀'	),
    new Quote('Always leave the classroom a little better than you found it.',	'Brook Riggio 🚀'),	
    new Quote('"Guys"? Did you mean "squad"?',	'Brook Riggio 🚀'),
    new Quote('Always leave the group a little better than you found it.',	'Brook Riggio 🚀'),
    new Quote('If you think you can\'t, or if you think you can... you\'re right.',	'Brook Riggio 🚀'),
    new Quote('Always leave the kitchen a little better than you found it.',	'Brook Riggio 🚀'),	
    new Quote('Always leave the Slack channel a little better than you found it.',	'Brook Riggio 🚀'),
    new Quote('Always leave the bathroom a little better than you found it.',	'Brook Riggio 🚀'),	
    new Quote('Always leave the trail a little better than you found it.',	'Brook Riggio 🚀'),	
    new Quote('Always leave the code a little better than you found it.',	'Brook Riggio 🚀'),	
    new Quote('Our vision: Software development skills, for a better life, community, and world.',	'Brook Riggio 🚀'),

];

app.get('/', (req, res) => {
    let randomQuote = quotes[Math.floor(Math.random() * quotes.length)];
    res.json(randomQuote);
})

app.listen(process.env.PORT||3000, () => {
    console.log(`listening on port ${process.env.PORT||3000}`);
});
