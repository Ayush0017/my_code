
// Write a program to swap without using third variable..
function swap()
{
let x = 5
let y = 6
console.log("before swap x is:"+ x);
console.log("before swap y is:"+ y);
x = x + y
y = x - y
x = x - y

console.log("After swap x is:"+ x)
console.log("After swap y is:"+ y) 

}
swap();