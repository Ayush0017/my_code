
/*
Case1 = 

for(i=0;s[i];i++)  
{
if(s[i]>=65 && s[i]<=90)
s[i]+=32;//s[i]-=32
}

Case2 =
for (i = 0; s[i]!='\0'; i++) 
{
if(s[i] >= 'a' && s[i] <= 'z') 
{
s[i] = s[i] -32;
}
}

hello world!
HELLO WORLD!

Case3 =

for (i = 0; s[i]!='\0'; i++) 
{
if(s[i] >= 'A' && s[i] <= 'Z') 
{
s[i] = s[i] + 32;
}
}

HELLOWORLD
helloworld

*/

//WAP to convert single character string into its cross case

var data= "Ayush Soni";
function convertToLowercase() 
{
var lowerCase = data.toLowerCase();
console.log(lowerCase);
}

function convertToUppercase() 
{
var upperCase = data.toUpperCase();
console.log(upperCase);
}

convertToUppercase();

convertToLowercase();



