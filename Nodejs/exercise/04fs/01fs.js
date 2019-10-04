const fs = require('fs');
const path = require('path');
// 判断服务器上有没有upload目录，如果没有就创建目录（适用于图片上传）
//Nodejs/exercise/04fs/upload正确
//path.join(__dirname,"./upload")正确，但需要require调用path模块(推荐)
fs.stat(path.join(__dirname,"./upload"),(err,stats)=> {
    if (err) {
        fs.mkdir(path.join(__dirname,"./upload"),(error)=>{
            if (error) {
                console.log(error);
                return false;
            }

            console.log("创建成功");
            
        })
    }else{//else必须有，否则报错
    console.log("目录已经存在，目录名：");
    
    console.log(__dirname);
    
    console.log(stats.isDirectory());
    }
    
})

//找出html目录下的所有目录并打印出来readfile只适用于小文件，大文件用文件流
fs.readdir(path.join(__dirname,"../04fs"),function (err,files) {
  if (err) {
      console.log(error);
      
  } else {
      console.log(files);//数组

      for (let i = 0; i < files.length; i++) {
          console.log(files[i]);
          
      }
  }  
})


