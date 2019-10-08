const fs = require('fs');

function delfile() {
    return new Promise((resolve,reject)=>{
        //异步操作
        // fs.unlink('./test.js',(err)=>{
        //     if (err) {
                reject('失败了');
        //     }else{
                // resolve('成功了');
        //     }
        // })      
    })
}
//如果执行reject就走catch，如果执行resolve就执行then
delfile()
.then((msg)=>{
    console.log('then:'+msg);
})
.catch((err)=>{
    console.log('err:'+err);
});