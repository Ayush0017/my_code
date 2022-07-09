
//WAP to check greater number between four numbers using if-elseif-else statement
function find_greatest() 
{
var a=4;
var b=6;
var c=2;
var d=8;
 
if (a > b) 
{  
if (a > c) 
{  
if (a > d) 
{  
console.log(a + " = a is greatest");  
}  
else 
{  
console.log(d + " = d is greatest");  
}  
}  
}  
else if (b > c)
{  
if (b > d) 
{  
console.log(b + " = b is greatest");  
}  
else 
{  
console.log(d + " = d is greatest");  
}  
}  
else if (c > d) 
{  
console.log (c + " = c is greatest");  
}  
else 
{  
console.log (d + " = d is greatest");  
}  
}
 
find_greatest();
