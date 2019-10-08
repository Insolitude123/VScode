const express = require('express');
const router = express.Router();

router.get('/add', (req, res) => {
    res.send('add  ok');
})

router.get('/del', (req, res) => {
    res.send('del  ok');
})

module.exports = router;
