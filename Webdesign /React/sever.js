const express = require('express');
const cors = require('cors');
const skateboards = require('./routes/skateboards');

const app = express();
const PORT = 5000;

app.use(cors());
app.use(express.json());

app.use('/api/skateboards', skateboards);

app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});
