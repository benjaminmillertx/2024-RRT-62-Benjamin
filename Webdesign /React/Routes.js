const express = require('express');
const router = express.Router();

const skateboards = [
    { id: 1, name: 'Custom Skateboard 1', description: 'High-quality custom skateboard' },
    { id: 2, name: 'Custom Skateboard 2', description: 'Durable and stylish skateboard' },
];

router.get('/', (req, res) => {
    res.json(skateboards);
});

module.exports = router;
