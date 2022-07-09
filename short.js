
 
// Bubble sort 
// descending order.
     
function print(a,n)
{
    console.log("Descending order is = "); 
	 for (let i = 0; i <= n; i++)
        console.log(a[i] + " ");
   
}
 

function sort(a,n)
{   
for (let i = n;
    i >= 0; i--)
for (let j = n;
    j > n - i; j--)
if (a[j] > a[j-1]){
    let tempswap = a[j];
    a[j] = a[j - 1];
    a[j - 1] = tempswap;
}
print(a, n);
     
}
 
let n = 5;
let a =[1,2,4,3,5,67]
console.log("Array is = "+ a );
/*
let a=[];
a.push(2);
a.push(4);
a.push(3);
a.push(2);
a.push(4);
a.push(5);
a.push(3);
*/
sort(a, n);
         
     
