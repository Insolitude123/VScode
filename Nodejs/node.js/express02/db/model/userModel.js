const mongoose = require('mongoose');
var Schema = mongoose.Schema;
//获取schema
var userSchema = new Schema({
    //required:true是表示此值为必须的
    // 注意：如果需要存数字(特别是小数)，但是要做加减运算时，
    // 为了保证浮点数精度，需要存值为字符串，而不是number
    //执行运算时，可用做法例如 (保留4位小数)[a*10000+b*10000]/10000
    username: { type: String, required: true },
    password: { type: String, required: true },
    age: Number,
    sex: { type: Number, default: 0 }
});
//将schema 对象转化为数据模型
var user = mongoose.model('user', userSchema);

module.exports = user;