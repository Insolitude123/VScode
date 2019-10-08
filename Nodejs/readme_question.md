## 1.服务器不需要重启直接刷新，需要npm的supervisor,
### 如果启动时命令行无限执行不停，注意文件路径是否正确;该文件是否已经被启动；端口是否被占用
[目标文章]https://www.jianshu.com/p/6d84e5efe99d
   npm install -g supervisor
   基本使用
最常用、最快捷的方式，就是直接进入你的网站根目录，执行：

supervisor myapp
## 这里要说明的一点是，不论你的网站服务启动文件在什么位置，你必须在根目录启动它。(仔细阅读)

举个例子，Express4.0中，启动文件位于 ./bin/www 中，则我们启动时，必须在 ./ 中执行：

supervisor bin/www 
而不能进入 bin 目录执行： supervisor www。这样虽然有可能也能启动，但这么做相当于把 bin 目录当作了服务的根目录了，一旦有涉及到文件目录的操作，一定会出错的。

另外，执行完这个命令后，我们的网站服务就已经启动了；不过，需要注意的是，这种方式启动的服务，是默认监控所有文件、文件夹的变化的；一旦有变化，服务就会重启（这个是node特性造成的，如果你对node的原理感兴趣，可以阅读这篇文章：《Node.js 包教不包会》）。

这样就出现了一些问题：我们会将一些日志文件存入某些文件夹，或者用户会上传附件到服务器；而这样的操作都导致了服务器文件的变化，必然会引起node服务器的重启。试想一下，如果每一次上传都重启一次，那用户操作一旦频繁起来，服务器啥都不用干，每天重启就行了（我的网站就出现过这样的问题，参看：2017.03.25_ajax更新数据时报错net::ERR_CONNECTION_RESET）。

所以说，supervisor的这种工作方式，仅仅适用于调试阶段；甚至于有一些调试环境都不适合（比如调试服务器在远程，网络状态不是很好的情况下）。

那么要如何解决呢？请往下看。

可以知道，如果想不监控某一些文件夹，可以使用 -i 参数。如：我们要忽略根目录下的 private 文件夹，可以这样启动：

supervisor -i ./private myapp
如果要忽略多个文件夹，则用英文的逗号,分隔：

supervisor -i ./private,./otherdir myapp

## 关于nodejs的npm命令无效问题 
[https://blog.csdn.net/qq_39085705/article/details/81134453]
npm 命令无反应了！ 然后我再开一个终端输入 npm -v 

找到  C:\Users\Super\.npmrc  （根据个人电脑找到 .npmrc文件）

删除 这个 .npmrc文件即可

## vscode nodejs智能提示功能
[https://www.cnblogs.com/lcawen/p/9455199.html]

1.依赖一些第三方的插件，先安装typings这个包，如果使用的是淘宝镜像，输入cnpm。cmd执行：

cnpm i typings -g
//cnpm install typings -global
2.通过上面的命令，typings这个包就下载下来了，然后我们到项目开发目录，打开命令窗口，输入：

typings init
这时当前目录下会出现一个typings.json的文件，这个文件就是typing的配置文件（安装过的typings包），一般用于团队开发使用，类似npm的package.json

然后在改目录命令窗口下输入以下命令，安装js插件的提示文件，如下：

    注意 需要在VScode的控制面板输出
    typings install dt~node --global --save
    typings install dt~jquery --global --save
    typings install dt~express --global --save
（–global：代表全局文件，有些包必须得加上这个参数才行） 
（–save ：表示将此次的安装信息记录到上面讲的typings.json中)

到这里还不行，VSCode后还是没有提示，需要在当前目录下新建一个空的jsconfig.json文件，这一步至关重要；当新建完此文件后，重启VSCode就可以获得代码提示了

## vs code 禁止在系统上运行脚本
[https://blog.csdn.net/luodong1501/article/details/100115267]

在使用vs code 创建angular/node.js组件的时候，报错

无法运行脚本，应该是不被信任，查看一下

（以下需要vscode输入）

get-ExecutionPolicy(如果报错，根据报错提示信息，使用报错提示的输入命令解决)

果然不被信任，修改让其信任
    
set-ExecutionPolicy RemoteSigned
解决

## 怎么办呢? 猜测是express版本更新了,但是我们不知道新版本该怎么玩了.所以我就只好先删除当前安装的express,重新安装以前的版本试试.测试ok.

    此处使用的命令有

    卸载: npm uninstall -g express

    安装指定版本: npm install -g express@3.5.0

    查看版本: express -V

    注意express -V中的V要大写,不然很多版本中会不识别

  当然,你只是想要解决express命令不能识别的问题.此时你已经达到目的了.但是为什么新版本我们用不了呢?

     原来,最新express4.0版本中将命令工具分家出来了(项目地址:https://github.com/expressjs/generator),所以我们还需要安装一个命令工具,命令如下:

npm install -g express-generator

