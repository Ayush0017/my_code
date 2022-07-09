
// Sum of elements at even and
// odd index positions separately
 
function EvenOddSum(arr, n)
{
let even = 0;
let odd = 0;
for (let i = 0; i < n; i++)
{
(i % 2 == 0)?even += arr[i]:odd += arr[i];
}
console.log("Even index positions sum " + even);
console.log( "Odd index positions sum " + odd);
}
 
// Driver function
let arr = [ 1, 2, 3, 4, 5, 6 ];
let n = arr.length;
console.log(arr);
EvenOddSum(arr, n);
 
