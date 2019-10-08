const express = require('express');
const app = express();

//(supervisor)路径cd Nodejs/node.js/express01/middlewear.js

//中间件，中间件也分全局和局部的中间件，局部中间件参考middlewear2.js
//内置中间件(静态资源目录)static
//指定一个目录，这个目录可以被访问(例如放置图片)

app.use('/',(req,res,next)=>{//参数中的第一项'/'可以省略，省略后可对比ex01.js文件中的body-parser模块的写法
    console.log('中间件');
    let {token}= req.query;
    if (token) {
        next();//表示是否继续往下执行
    } else {
        res.send('缺少token');
    }
})

//使用该中间件的原因在视频的19集5分0秒有解释，19集名称和本文件名一致，因顺序错误可能会和18集对调
app.get('/test1',(req,res)=>{
    console.log('test1');
    res.send('test1');
    // let {token}= req.query;
    // if (token) {
    //     res.send('ok');
    // } else {
    //     res.send('err');
    // }
})

app.get('/test2',(req,res)=>{
    console.log('test2');
    res.send('test2');
    // let {token}= req.query;
    // if (token) {
    //     res.send('ok');
    // } else {
    //     res.send('err');
    // }
})

app.listen(3000,()=>{
    console.log('server start');
})