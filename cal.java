import java.util.Scanner;

class Main
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double first = sc.nextDouble();
        double second = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%f %c %f = %f", first, operator, second, result);
    }
}
