const express = require('express');
const path = require('path');

const app = express();

//express.static()的参数需要绝对路径(物理路径)
app.use(express.static(path.join(__dirname,'./hehe')))


app.listen(3000,()=>{
    console.log('server start');
})
