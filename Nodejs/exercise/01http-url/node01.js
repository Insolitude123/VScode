// console.log(__dirname)//若文件名只写node.js会报错！！！
const http = require('http');
http.createServer(function(req,res){
    res.writeHead(200,{"Content-Type":"text/html;charset=UTF-8"});
    res.write('你好啊 nodejs ');
    res.end();
}).listen(8001);