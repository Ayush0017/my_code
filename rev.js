
 
// Javascript program to reverse
// a subarray arr[0..k-1]
 
// Reverse subarray a[0..k-1]
function reverse( a, n)
{
    if (k > n)
    {
        console.log("Invalid k");
        return;
    }
 
    // One by one reverse first
    // and last elements of a[0..k-1]
    for (let i = 0; i < Math.floor(k/2); i++)
    {
      let temp = a[i] ;
      a[i] = a[k-i-1] ;
      a[k-i-1] = temp ;
    }
     
}
    // driver code
     
    let a = [1, 2, 3, 4, 5, 6];
	console.log("value is = " + a ); 
    let n = a.length, k = 6;
 
    reverse(a, n, k);
	console.log("Reversed order is = "); 
    for (let i = 0; i < n; ++i)
        console.log(a[i] + " ");
 
