import java.util.Scanner; 
  
// Replace 
class test 
{ 
public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System .in);
System.out.print("Enter your matter here =" ); 
String n=sc.nextLine();
n=n.replace("Dog","#***#");
n=n.replace("Pig","#***#");
n=n.replace("Donkey","#***#");
n=n.replace("Monkey","#***#");
n=n.replace("Snake","#***#");
System.out.println(n);
}
}