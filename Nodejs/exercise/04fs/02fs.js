const events = require('events');

console.log(events);


let EventsEmitter = new events.EventEmitter();

EventsEmitter.on('tomime',function (data) {
    console.log(data);
})

EventsEmitter.on('toparent',function (data) {
    console.log(data);
    EventsEmitter.emit('tomime','world')
    
})

setTimeout(function name(params) {
    console.log('开始');
    EventsEmitter.emit('toparent','hello');
},1000);




// for (let i =0;i < 3 ; i++) {
//     setTimeout(() => {
//         console.log(i);
//     }, 0);
// }