
//Write a program to calculate Simple Interest & Compound Interest..
function  Simple_Interest()
{
var p,t,r,si,ci;
p = 5000;
t = 5;
r = 3;
si = (p*t*r)/100;
amount = p*Math.pow((1 +r/100),t );
ci = amount-p;
console.log("principle : "+ p );
console.log("rate : "+ r );
console.log("time : "+ t );
console.log("Simple interest : "+si);
console.log("Compound interest : "+ci);
}
Simple_Interest();
