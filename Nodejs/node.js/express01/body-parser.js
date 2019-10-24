// const express = require('express');
// const app = express();
const app = require('express')();
const bodyparser = require('body-parser');
//app.use  使用中间件(插件)
//解析表单数据 x-www-form-urlencode 
app.use(bodyparser.urlencoded({ extended : false }));//(以表单形式传递数据)
app.use(bodyparser.json());
// .....................;(formdata)
//express实例化

//最简单的API接口
app.get('/user/login',(req,res)=>{
    console.log('你好');
    res.send('注册OK');
    
})

//express不能直接解析消息体，需要通过第三方插件实现
//安装body-parser，cnpm install body-parser(使用npm报错)
//本模块包似乎需要安装在同一目录下，根目录下安装似乎不会出现包以及方法的智能提示
app.post('/user/reg',(req,res)=>{
    console.log('你好');
    res.send('注册OK');
    
})

app.listen(3000,()=>{
    console.log('start');
    
})