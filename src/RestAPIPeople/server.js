const express = require("express")
const app = express();
const port = 3000;

const data = [
    { name: "Hans", age: 18, },
    { name: "Franz", age: 79, },
    { name: "Gerhart", age: 9, },
    { name: "Blöckes", age: 89, },
    { name: "Miku", age: 16, },
    { name: "Riedmann", age: 99, },
    { name: "Hannes", age: 18, },
]

app.get('/people', (req, res) => {
    res.send(data);
});

app.post('/people', (req, res) => {
    res
})

app.listen(port, () => console.log(`Hello world app listening on port ${port}!`))