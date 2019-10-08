const fs =require('fs');
const path = require('path');
//封装
function isExist() {
    return new Promise((resolve,reject)=>{
        fs.stat(path.join(__dirname,'./test.js'),(err,stats)=>{
            // console.log(stats);
            if (err) {
                reject('文件不存在:'+__dirname);
            } else {
                resolve('文件存在');
            }
        })
    });
}
 
function delFile() {
    return new Promise((resolve,reject)=>{
        fs.unlink(path.join(__dirname,'./test.js'),(err)=>{
            if (err) {
                reject('删除失败');
            } else {
                resolve('删除成功');
            }
        })
    });
}
//then的链式调用，catch只需要一个。终止后后面的then不执行
//想要之后的then不执行，只要在前面的then里面抛出错误，强制进入catch即可
isExist()
.then(()=>{
    return delFile();
})
.then(()=>{
    console.log('删除成功');
    throw new Error('手动终止');
})
.then(()=>{
    console.log('test111');
})
.then(()=>{
    console.log('test222');
    
})
.catch((err)=>{
    console.log(err);
});