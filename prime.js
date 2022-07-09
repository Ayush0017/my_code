
//WAP to check entered number is prime or not.
function Prime()
{
var i,flag=0,number;
number = 5

for(i=2; i <= number/2; i++)
{
if(number%i == 0)
{
flag = 1;
break;
}
}
if(flag == 0)
{
console.log(number +" = is prime number");
}
else
{
console.log(number +" = is not a Prime number");
}
}
Prime();

	