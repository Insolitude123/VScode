let name={
    a : function (n,m,callback) {
        let a = n;
        let b = m;
        let c = a+b;
        // callback(c);
        return c;
    }
}

module.exports = name;

let nm=name.a(1,2,function (c) {
    console.log(c);
    
})
console.log(nm);
