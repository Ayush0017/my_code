
/* WAP to check entered single character string is upper case or lower case */

var s,n

s="J"
n=s.charCodeAt(0)

if(n>=65 && n<=90)
	console.log(s + " = Upper case string")
else if(n>=97 && n<=122)
	console.log(s + " = Lower case string") 
else
	console.log("Invalid string")

