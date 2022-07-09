
/* WAP to check entered 3-digit number is armstrong or not using if-else */

var n,d1,d2,d3
n=153

d1=n%10
d2=parseInt(n/10)%10
d3=parseInt(n/100)

s=Math.pow(d1,3)+Math.pow(d2,3)+Math.pow(d3,3)

if(n==s)
 console.log(n + " =  Number is armstrong")	  
else
 console.log(n + " =  Number is not armstrong")	  

