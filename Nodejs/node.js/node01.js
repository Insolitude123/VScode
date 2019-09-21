
var liList = document.querySelectorAll('li') // 共5个li
for( var i=0; i<liList.length; i++){
  liList[i].onclick = function(){
    console.log(i)
  }
}

