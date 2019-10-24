//https://www.bilibili.com/video/av53978941/?p=25
"use strict"
const nodemailer = require('nodemailer');

let transporter = nodemailer.createTransport({
    host:'smtp.qq.com',
    port:465,
    secure:true,
    auth:{
        user:'617653230@qq.com',
        pass:'hhnsqjzimmewbcdf'
    }
});

function send(mail,code) {
    let mailobj = {
        from: '"Fred Foo 👻" <617653230@qq.com>', // sender address
        to: mail, // list of receivers
        subject: 'Hello', // Subject line
        text: '您的验证码是'+code+'，有效期5分钟', // plain text body
        // html: '<b>Hello world?</b>' // html body
        //text和html 两个只能有其一，否则只会显示一个
    }
    return new Promise((resolve,reject)=>{
        transporter.sendMail(mailobj,(err,data)=>{
           if (err) {
               reject();
           } else {
               resolve();
           }
            
        });
    })
}
module.exports = {send:send};