## express不能直接解析消息体，需要通过第三方插件实现
   安装body-parser，npm install body-parser


## postman 做接口测试，例如post传参数时不方便验证是否成功的问题，见视频第16集13分0秒
   需要在官网下载

### markdown的使用
# 配置npm在视频第三集12分10秒//https://www.bilibili.com/video/av53978941/?p=21
## 二级标题
npm :node version manager

npm :node package manager 
``` java
public void test(){
    system.out.println("hello world!!!");
} 
```
> 内容引用
+ NO.1
    + NO.3
        + NO.5
    + NO.4
    -NO.6
+ NO.2
    1. a
    2. b
    3. c

[官网连接](www.baidu.com)

### ---------------------------------------------------

## 解决nodejs因为大量异步函数可能导致的回调地狱
promise
async/await异步/等待(es7)
blue bird蓝鸟

## promise
  var promise = new Promise(function(resolve,reject)){//先new一个promise对象
      //异步处理
      //处理结束后,调用resolve(决定)或reject(拒绝)
      resolve('成功处理')
      reject('错误处理')
  } 

## mongoose安装 npm install mongoose(可以有cnpm，但是第一次没成功，无响应，第二次才成功)
const mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/test');/test为数据库名称

## 以上代码因为版本更新，会出现警告，需要将mongoose.connect('mongodb://localhost/test');改为mongoose.connect('mongodb://localhost/test',{ useNewUrlParser: true , useUnifiedTopology: true });

var db = mongoose.connection;
db.on('error',console.error.bind(console,'connection error'));//失败走此
db.once('open',function(){
    
});//成功走此


