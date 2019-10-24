//推荐参考mongoose文档(视频使用中文文档，还行，但推荐英文文档)
//连接数据库
const mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/user',{ useNewUrlParser: true , useUnifiedTopology: true });

var db = mongoose.connection;
db.on('error',console.error.bind(console,'connection error'));
db.once('open',function(){
    console.log('数据库连接成功');
});

//schema对象，mongoose通过此对象操作数据库

//创建一个和集合相关的schema对象，相当于SQL中的表头(表头就是姓名，年龄，手机号，地址等第一排排头)
var Schema = mongoose.Schema;
//获取schema
var userSchema = new Schema({
//required:true是表示此值为必须的
    username : {type:String,required:true},
    password : {type:String,required:true},
    age : Number,
    sex : {type:Number,default:0}
});
//将schema 对象转化为数据模型
var user = mongoose.model('user', userSchema);
//集合名称如果不是复数形式，在创建数据集合(collection)名称时会自动编程复数，
//如：user自动变users，child自动变children，所以建议collection的名称直接写复数
//该数据对象和集合(数据表)关联（'集合名'，schema对象）


//操作数据库  增删改插

//查询数据,如果没查到数据，还是会走then()，因为catch是出错，没查到数据只是数据为空，并不是错误
// User.find({age:17})

//插入数据
// User.insertMany({username:'zhangsan',password:'123',age:16})

//删除数据
// User.remove()

//修改数据
user.updateOne({username:'lisi'})

.then((data)=>{
    console.log(data);
    console.log('成功');
})
.catch((err)=>{
    console.log('失败');
})
