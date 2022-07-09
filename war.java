import java.util.Scanner;
class Choose
{
void m()
{
System.out.println("You Have To choose Atleast One Weapon For Fight");
System.out.println("     ");
}
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
void gun()
{
System.out.println("you choose Gun For Fight In War");
}
}
class Boom extends Weapon
{
void boom()
{
System.out.println("you choose 'BOOM' For Fight In War");
}
}
class Machine_Gun extends Weapon
{
void machine_Gun()
{
System.out.println("you choose Machine_Gun For Fight In War");
}
}

class test
{
public static void main(String arg[] )
{
Scanner sc = new Scanner (System.in);
Weapon r = new Weapon();
r.m();
System.out.println("List  Of Weapon For War");
System.out.println("    ");
System.out.println("1. Gun");
System.out.println("2. Bomb");
System.out.println("3. Machine_Gun");
		
int x=sc.nextInt();

if(x==1)
{
Gun g = new Gun();
g.gun();
r.n();
}
else if(x==2)
{
Boom b = new Boom();
b.boom();
r.n();
}
else if(x==3)
{
Machine_Gun m = new Machine_Gun();
m.machine_Gun();
r.n();
}
else 
{
System.out.println("you press wrong button  put value between 1-To-3");
}

}
}
