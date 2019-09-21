const http= require('http');

const config=require('./config');

let app = http.createServer((req,res)=>{
    res.writeHead(200,{"Content-Type":"text/html;charset=utf-8"});

    res.write('你好 nodejs');

    console.log(config.str);

    res.end();
})

.listen(8002,'127.0.0.1');
