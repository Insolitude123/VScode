const express = require('express');
const router = express.Router();
const user = require('../db/model/userModel');
let codes = {};

router.post('/reg', (req, res) => {
    //获取数据
    let { us, ps, code } = req.body;
    console.log(us, ps, code, !(us && ps));
    if (!(us && ps && code)) {
        return res.send({ err: -1, msg: '参数错误' });
    }
    if (code[us] != code) {
        return res.send({ err: -4, msg: '验证码错误请重试' });
    }
    user.find({ username: us })
        .then((data) => {
            if (data.length == 0) {
                return user.insertMany({ username: us, password: ps });
            } else {
                res.send({ err: -3, msg: '用户名已存在' });
            }
        })
        .then(() => {
            res.send({ err: 0, msg: '注册ok' })
        })
        .catch((err) => {
            res.send({ err: -1, msg: '参数err' })
        });
    //数据处理

    //返回数据

    // res.send('test ok');
})

router.post('/login', (req, res) => {
    let { us, ps } = req.body;
    if (!(us && ps)) {
        return res.send({ err: -1, msg: '参数错误' });
    }

    //如果字段名和值变量名相同，例如{us:us,ps:ps}可简写为{us,ps }
    user.find({ username: us, password: ps })
        .then((data) => {//data为数组类型(鼠标悬浮于data变量上可显示)
            if (data.length > 0) {
                res.send({ err: 0, msg: '登录成功' });
            } else {
                res.send({ err: 0, msg: '登录失败' });
            }
        })
        .catch((err) => {
            res.send({ err: -1, msg: '内部错误' })
        })
})

app.post('/getMailCode', (req, res) => {
    let { mail } = req.body;
    let code = parseInt(Math.random() * 10000);
    Mail.send(mail, code)
        .then(() => {
            codes[mail] = code;
            res.send({ err: 0, msg: '验证码发送成功' });
        })
        .catch((err) => {
            res.send({ err: -1, msg: '验证码发送失败' });
        })
})


module.exports = router;