
//WAP to print fabonacii series upto n elements.
function fibonacci()
{
    var a, b, c, i, terms;

    terms= 20;

    /* Fibonacci magic initialization */
    a = 0;
    b = 1;
    c = 0;

    console.log("Fibonacci terms: \t");
	
    for(i=1; i<=terms; i++)
    {
        console.log("\t"+c+"\t");

        a = b;     
        b = c;     
        c = a + b;
    }
}
fibonacci();




