
//WAP to search element inside 8 elements array

var ar=[10,20,30,10,50,60,10,80]
var n=20 
var flag=1
console.log(ar);

for(let i in ar)
{
 if(ar[i]==n)
 {
	console.log(n+" Element found at index : "+i)
   flag=0
 }
}

if(flag)
	console.log("Element not found")		
