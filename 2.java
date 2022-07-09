import java.util.Scanner; 
  
// Reverse or upper case or lower case.
class test 
{ 
public static void main(String[] args) 
{ 
String name, rev="";

Scanner sc = new Scanner(System .in);

System.out.print("Enter your name =" ); 
name=sc.nextLine();

name=name.replace("Dog","#***#");
name=name.replace("Pig","#***#");
name=name.replace("Donkey","#***#");
name=name.replace("Monkey","#***#");
name=name.replace("Snake","#***#");
name=name.replace("dog","#***#");
name=name.replace("pig","#***#");
name=name.replace("donkey","#***#");
name=name.replace("monkey","#***#");
name=name.replace("snake","#***#");

String lower=name.toLowerCase();
System.out.println("......................................."); 
System.out.println(lower); 
 
String upper=name.toUpperCase();
System.out.println(".......................................");
System.out.println(upper);
  
int l=name.length();

for (int i =l-1;i>=0;i--)
rev= rev + name.charAt(i);

System.out.println(".......................................");
System.out.println("Reverse of the \"string\" is :- "+  rev); 
} 
} 