
//Functional return value
//Function without arguments & with return value 

function add()
{
 var a,b,c;
 a=2;
 b=2;
 c=a+b;
 return {'a':a,'b':b,'c':c}
}

//Function with arguments & without return value 
function table(t)
{
console.log("Table of addition result = ");
i=1;
while(i<=10)
{
 let r=t*i;
 console.log(t+" X "+i+" = "+r);
 i++;
}
}

var res
res=add()
console.log("a = "+res.a);
console.log("b = "+res.b);
console.log("add = "+res.c); 

add();
table(t=res.c);
