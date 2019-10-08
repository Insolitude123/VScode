const express = require('express');
const app = express();

// app.get('/user/add',(req,res)=>{
//     res.send('user/add  ok');
// })

// app.get('/user/del',(req,res)=>{
//     res.send('user/del  ok'); 
// })

let userRouter = require('./router/userRouter');
let foodRouter = require('./router/foodRouter');

app.use('/user', userRouter);
app.use('/food', foodRouter);

app.listen(3000, () => {
    console.log('server start');
})