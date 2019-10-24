## 2019最新nodeJS从入门到大神【千锋Web前端】https://www.bilibili.com/video/av53978941/?p=14，介绍API接口在14集6分35秒

## 安装express npm install (-g) express --save  ,所在目录文件夹名称可能不能用express，安装虽然成功但是没有显示node_modules第三方模块文件夹

## 模块(第三方)的引用，从当前目录的node_modules 以此向上寻找，就是说外部的node_modules文件夹如果包含目标模块，也可以引用

## express 
var express = require('express');
var app = express();//这里似乎省略了new，其他老版本视频为new express();