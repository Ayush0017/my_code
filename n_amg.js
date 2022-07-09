
function n_Armstrong()
{

// program to check an Armstrong number of n digits

var number =153;
var numberOfDigits = number.length;
var sum = 0;

var temp = number;

while (temp > 0) {

let remainder = temp % 10;
sum += remainder ** numberOfDigits;
temp = temp / 10;
}
if (sum == number) {
    console.log(number + " = is an Armstrong number");
}
else {
     console.log(number + " = is not an Armstrong number");
}
}
n_Armstrong();

	