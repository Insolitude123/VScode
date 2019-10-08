# 1.package.json 创建本文件，需要进入对应目录输入npm init --yes生成

## 1.1 npm i silly-datetime 创建silly-datetime模块需要进入对应目录输入命令
    创建完成后silly-datetime第三方模块文件夹会出现在node_modules文件夹下
    node_modules文件夹存放所有的第三方模块，安装时没有此文件夹会自动创建
    package.json 在创建此文件后加的自定义模块.
   ### 1.2 需要例如命令后加  --save/--save-dev 
    (添加成功后不光是node_modules文件夹，下添加第三方模块，还会在package.json文件中的"dependencies"/"devDependencies"中添加与模块名对应的名称值)因为换设备/本模块发送给别人，不会发送第三方模块，需要使用npm install，通过package.json中"dependencies"/"devDependencies"记录的模块名称自动寻找并下载对应的第三方模块，如果package.json文件中没有记录，其他人/设备重新安装会很麻烦.

   ### 1.3 mongoDB数据库在目标目录中的安装操作 cnpm install mongodb  --save-dev
    需要require导入的包
    1.const MongoClient = require('mongodb').MongoClicent;//Clicent(客户端)
    2.const assert = require('assert');//(调试用，参考Junit)
    3.const ObjectId = require('mongodb').objectID;//编辑数据改变ID的时候使用，ID是字符串，需要改成object类型时(不用也许可以不引入?)
    4.const url = 'mongodb://localhost:27017/test';(/test表述数据库名称)

    命令行输入：mongod --dbpath F:\MongoDB\MongDataBase
    以此链接数据库，路径位存放数据库的数据的文件夹
    1.连接数据库
    2.增删改查
    3.关闭数据库

## 2. 使用自动更新服务器功能需要先启动supervisor (文件名).js
    如果VScode终端报错死循环，注意路径是否正确.
## 3. http的请求头内容："Content-Type":"text/html;charset=UTF-8"
    写错会造成UTF-8不执行,出现中文乱码.

## 4. mime.json(Multipurpose Internet Mail Extensions)作用：判断http请求的文件类型，根据具体类型返回对应请求头文件类型的封装数据文件
