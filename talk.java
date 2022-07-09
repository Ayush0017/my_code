import java.util.Scanner; 
class Talk
{
void talk()
{
String str,str1,str2,str3,str4;
Scanner sc = new Scanner(System .in);
System.out.println("** Hello ! **"); 
str=sc.nextLine();
start:
if(str.contains("hello")||str.contains("Hello")||str.contains("hii")||str.contains("Hii")||str.contains("hey")||str.contains("Hey")||str.contains("hi")||str.contains("Hi"))
{
System.out.println(" "); 
System.out.println("** How are you ? **"); 
str1=sc.nextLine();
if(str1.contains("Fine")||str1.contains("fine")||str1.contains("yes i am fine")||str1.contains("Yes i am fine")||str1.contains("good")||str1.contains("Good")||str1.contains("nice")||str1.contains("Nice")||str1.contains("Great")||str1.contains("great"))
{
System.out.println(" \"Oooh\" Nice!\n Always be Happy \n God all Always with you ");
System.out.println(" ");
System.out.println(" \"i am also fine\" ");
System.out.println("  "); 
System.out.println(" Do you like pets ? ");
str2=sc.nextLine();
if(str2.contains("yes")||str2.contains("Yes")||str2.contains("yes i like pets")||str2.contains("Yes i like pets")||str2.contains("absolutely")||str2.contains("Absolutely")||str2.contains("yeep")||str2.contains("Yeep")||str2.contains("ofcourse")||str2.contains("Ofcourse"))
{
System.out.println(" Which pet do you like most?  ");
str3=sc.nextLine();
if(str3.contains("cat")||str3.contains("Cat"))
{
System.out.println(" ");
System.out.println("\"Woow, you like cat\" "); 
System.out.println(" ");
}
else if (str3.contains("Dog")||str3.contains("dog"))
{
System.out.println(" ");
System.out.println("\"Woow, you like Dog\" "); 
System.out.println(" ");
}
else if(str3.contains("Monkey")||str3.contains("monkey"))
{
System.out.println(" ");
System.out.println("\"Woow, you like Monkey\" "); 
System.out.println(" ");
}
else if (str3.contains("pig")||str3.contains("Pig") )
{
System.out.println(" ");
System.out.println("\"Woow, you like Pig\" "); 
System.out.println(" ");
}
else
{
System.out.println(" "); 
System.out.println("Sorry ! \"i can't understand your language\".\n ** Please! talk in right way ** \n ** Thank you **");
}
}
else if (str2.contains("no")||str2.contains("No")||str2.contains("Disgusting")||str2.contains("disgusting")||str2.contains("not")||str2.contains("Not")||str2.contains("nhai")||str2.contains("Nhai")||str2.contains("nhi")||str2.contains("Nhi"))
{
System.out.println(" You should like pets,Because they are so kind & loyal");


}

else
{
System.out.println(" "); 
System.out.println("Sorry ! \"i can't understand your language\".\n ** Please! talk in right way **\n ** Thank you **"); 
}
}

else if(str1.contains("not")||str1.contains("Not")||str1.contains("nhi")||str1.contains("Nhi")||str1.contains("tell")||str1.contains("Tell")||str1.contains("bad")||str1.contains("Bad")||str1.contains("Jhand")||str1.contains("jhand"))
{
System.out.println(" ");
System.out.println(" i'm sorry, i hope you get well soon ");
System.out.println(" Don't worry \"it's a life  some's time good & some's time bad.\".\n ** All is well Bro **"); 
}
else
{
System.out.println(" "); 
System.out.println("Sorry ! \"i can't understand your language\".\n ** Please! talk in right way **\n ** Thank you **"); 
}


}
else
{
System.out.println(" "); 
System.out.println("Sorry ! \"i can't understand your language\".\n firstly reply of my Hello!\n ** Thank you **"); 
}
}
}

class test 
{ 
public static void main(String[] args) 
{ 
Scanner sc=new Scanner(System.in);
int x=1;
do
{
if(x==1)
{
for(int i=0;i<3;i++)
{
System.out.println(" "); 
System.out.println("How can i help you?");
System.out.println(" "); 
Talk t=new Talk();
t.talk();
}
}
else
{
System.out.println("**Thanks**"); 
}
}
while(false);

}
}
