import java.util.Scanner;

abstract class Choose
{
void m()
{
System.out.println("You Have To choose Atleast One Weapon For Fight");
System.out.println("     ");
}
abstract void n();
}
class Weapon extends Choose
{
void n()
{
System.out.println("Let's  Began  War");
}
}
class Gun extends Weapon
{
void Gun()
{
System.out.println("Woow"+ " You choose Gun For Fight In War");
}
}
class Boom  extends Gun
{
void Boom()
{
System.out.println("Woow"+" You choose 'BOOM' For Fight In War");
}
}
class Machine_Gun extends Boom
{
void Machine_Gun()
{
System.out.println("Woow"+" You choose Machine_Gun For Fight In War");
}
}

class test
{
public static void main(String arg[] )
{
System.out.println("    ");
Weapon w=new Weapon();
w.m();
Scanner sc = new Scanner (System.in);
System.out.println("List  Of Weapon For War");
System.out.println("1. Gun");
System.out.println("2. Bomb");
System.out.println("3. Machine_Gun");
		
int x=sc.nextInt();

if(x==1)
{
System.out.println("    ");
Gun g = new Gun();
g.Gun();
System.out.println("    ");
g.n();
}
else if(x==2)
{
System.out.println("    ");
Boom b = new Boom();
b.Boom();
System.out.println("    ");
b.n();
}
else if(x==3)
{
System.out.println("    ");
Machine_Gun m = new Machine_Gun();
m.Machine_Gun();
System.out.println("    ");
m.n();
}
else 
{
System.out.println("you press wrong button  put value between 1-To-3");
}

}
}
