const express = require('express');

const app = express();

//局部中间件，仅针对某个function进行处理
app.get('/test1',(req,res,next)=>{
    //可以写多个局部中间件get(path,function,function,function)只要有next就会往下一个执行
    //一般只用1-2级的中间件，尽量不会更多
    console.log('fun1');
    next();
},(req,res)=>{
    console.log('fun2');
    
    res.send('test1');
})

app.listen(3000,()=>{
    console.log('server start');
})