
//sum of elements in a given array
function sum(arr) 
{ 
let sum = 0; // initialize sum 

for (let i = 0; i < arr.length; i++) 
sum += arr[i]; 
   
return sum; 
} 
let arr = [12, 3, 4, 15];
console.log(arr);
console.log("Sum of given array is " + sum(arr));
     
