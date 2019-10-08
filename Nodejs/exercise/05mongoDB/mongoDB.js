const http = require('http');
const MongoClient = require('mongodb').MongoClient;
const url = 'mongodb://localhost:27017/test';

http.createServer(function (req,res) {
    MongoClient.connect(url,function (err,db) {
        if (err) {
            console.log(err);
            console.log('数据库连接失败');
            return;
        }
        // db.collection(问题：没有这个函数，未解决)
        
    })
    

}).listen(8001);