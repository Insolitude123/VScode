//连接数据库
const mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/user',{ useNewUrlParser: true , useUnifiedTopology: true });

var db = mongoose.connection;
db.on('error',console.error.bind(console,'connection error'));
db.once('open',function(){
    console.log('数据库连接成功');
});