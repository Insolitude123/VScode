let c = {
    a : function(callback){
            let a = 1;
            let b = 2;
            console.log(a+b);
            callback();
    },

    b : {
        d:2+3,
        e:5+6
    }
    
}

c.a(function name(params) {
    console.log('hello');
});

console.log(c.b);
console.log(c);




