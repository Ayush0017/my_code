//single level inheritance
import java.util.Scanner;

class Student
{
int roll;
String name,name1,Class,school;
Scanner sc=new Scanner(System.in);
{
System.out.println("*****************************************************");
System.out.println("*                 !!    Note    !!                  *");
System.out.println("*****************************************************");
System.out.println("This Program is only for School students");
System.out.println(".-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
System.out.print("Please Enter Your School name =");
school=sc.nextLine();
System.out.print("Enter Your Class =");
Class=sc.nextLine();

}
void getStudent()
{
System.out.println(",.,.,.,.,.,..,,.,.,..,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.");
System.out.println(":      Now, Please enter your personal details:       :");
System.out.println(".,,.,.,.,.,.,.,..,,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,");
System.out.print("Please enter your roll no.=");
roll=sc.nextInt();
System.out.print("Please enter your First name = ");
name=sc.next();
System.out.print("Please enter your Last name = ");
name1=sc.next();
System.out.print("");
System.out.println("**************   Thanks for it.   **************");
}

void putStudent()
{
System.out.println(".......................................................");
System.out.println(".               your personal details is:             .");
System.out.println(".......................................................");
System.out.print("");
System.out.println("Roll no.is = "+ roll);
System.out.println("Name is = "+ name +" "+ name1);
}
};

class Academic extends Student
{
int p,c,m,e,com;
Scanner sc=new Scanner(System.in);
void getAcademic()
{
System.out.println(".......................................................");
System.out.println(".       Now ,Please enter your academic details:      .");
System.out.println(".......................................................");
System.out.println("");
System.out.print("Please enter your Physics marks =");
p=sc.nextInt();

System.out.print("Please enter your Chemistry marks =");
c=sc.nextInt();

System.out.print("Please enter your Maths marks=");
m=sc.nextInt();

System.out.print("Please enter your English marks =");
e=sc.nextInt();

System.out.print("Please enter your Computer marks =");
com=sc.nextInt();
System.out.println("");
System.out.println("***********   Thanks for your response   ***********");
}

void putAcademic()
{
System.out.println(".......................................................");
System.out.println(".               Your academic details is:             .");
System.out.println(".......................................................");
System.out.println("");
System.out.println("Physics marks is = "+ p);
System.out.println("Chemistry marks is = "+ c);
System.out.println("Maths marks is = "+ m);
System.out.println("English marks is = "+ e);
System.out.println("Computer marks is = "+ com);
int per=(p+c+m+e+com)/5;
System.out.println("");
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
System.out.println("^                Your result detail is               ^");
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
System.out.println("");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("");
System.out.println("!!Hello!! "+ name +" "+ name1);
System.out.println("Your school name is = "+ school);
System.out.println("Your roll no. is = "+ roll);
System.out.println("Your "+Class+" class present is = "+ per+"%");
System.out.println("");
System.out.println("**********  Best of luck for future  **********");
System.out.println("");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("");
System.out.println("//////////////////////////////////////////////////");
System.out.println("//                Hope you enjoyed it           //");
System.out.println("//            Thanx for use this program        //");
System.out.println("//////////////////////////////////////////////////");
}
};


class Test
{
public static void main(String ar[])
{
Academic a=new Academic();

a.getStudent();
a.getAcademic();
a.putStudent();
a.putAcademic();

}
}
