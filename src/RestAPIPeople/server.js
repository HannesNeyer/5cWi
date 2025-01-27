const express = require("express")
const bodyParser = require('body-parser');

const app = express();

app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())

const port = 3000;

const data = [
    { id:0, name: "Hans", age: 18, },
    { id:1, name: "Franz", age: 79, },
    { id:2, name: "Gerhart", age: 9, },
    { id:3, name: "Blöckes", age: 89, },
    { id:4, name: "Miku", age: 16, },
    { id:5, name: "Riedmann", age: 99, },
    { id:6, name: "Hannes", age: 18, },
]

app.get('/people', (req, res) => {
    res.send(data);
});

app.get('/people/:id', (req, res) => {
    res.send(data.id);
});

app.delete('/people/:id', (req, res) => {
    let id = req.params.id;
    console.log("id:," + id);

    data.splice(id, 1);
    res.send("done");
})

app.post('/people', (req, res) => {
    data.push(req.body);
    res.send(req.body)
})

app.listen(port, () => console.log(`Hello world app listening on port ${port}!`))