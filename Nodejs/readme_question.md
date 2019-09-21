## 1.服务器不需要重启直接刷新，需要npm的supervisor

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
    typings install dt~jquery --global --save
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

