//https://www.bilibili.com/video/av53978941/?p=24
//参考2019最新nodeJS从入门到大神【千锋Web前端】第24集
const express =require('express');
const db = require('./db/connect');//connect.js的js可以省略
const app = express();//似乎省略了new
const Mail = require('./utils/mail');

const bodyparser = require('body-parser');
//app.use  使用中间件(插件)
//解析表单数据 x-www-form-urlencode 
app.use(bodyparser.urlencoded({ extended : false }));//(以表单形式传递数据)
app.use(bodyparser.json());

//路由
const userRouter = require('./router/userRouter');

app.use('/user',userRouter);

app.listen(3000,()=>{
    console.log('server start');
})