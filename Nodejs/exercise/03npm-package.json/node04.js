const sd=require('silly-datetime');
const http = require('http');
http.createServer(function(req,res){
    res.writeHead(200,{"Content-Type":"text/html;charset=UTF-8"});

    let d = sd.format(new Date(),'YYYY-MM-DD HH-mm-ss');

    res.write('你好啊 nodejs'+d);
    

    res.end();
}).listen(8001);