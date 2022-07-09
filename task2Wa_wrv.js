
//Function with arguments & with return value 

function Add(a,b) {
   var add = a + b;
   return add;
}

function factorial(f) 
{ 

  if (f === 0)
 {
    return 1;
 }
  return f * factorial(f-1);
         
}

var a=2;
var b=6;

console.log("Your addition of two no. is = "+ Add(a,b));
console.log("Factorial of your addition result is = "+factorial(Add(a,b)));
Add(a,b);
factorial(f =Add(a,b));


