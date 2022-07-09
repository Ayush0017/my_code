//Hierarchichal inheritance
import java.util.Scanner;

class College
{
String name,email,contact;
Scanner sc=new Scanner(System.in);
College()
{
System.out.print("Please enter your name = ");
name=sc.nextLine();
System.out.print("Please enter your email = ");
email=sc.next();
System.out.print("Please enter your contact = ");
contact=sc.next();
}

void putCollege()
{
System.out.println("Name is = "+ name);
System.out.println("Email is = "+ email);
System.out.println("Contact no. is = "+ contact);
}
};


class BTech extends College
{
int physics,chemistry,maths;

BTech()
{
System.out.print("Please enter your Physics marks = ");
physics=sc.nextInt();

System.out.print("Please enter your Chemistry marks = ");
chemistry=sc.nextInt();

System.out.print("Please enter your Maths marks= ");
maths=sc.nextInt();
}

void putBtech()
{
putCollege();
System.out.println("Physics marks is = "+ physics);
System.out.println("Chemistry marks is = "+ chemistry);
System.out.println("Maths marks is = "+ maths);

int per=(physics+chemistry+maths)/3;
System.out.println("your percentage is = "+ per+ "%");

if(per>=70)
{
System.out.println(" your addmission is confirm ");
}

else 
{
System.out.println("your addmission is not confirm ");
}

}
};


class Bcom extends College
{
int eco,mang,acc;

Bcom()
{
System.out.print("Please enter your Economic marks = ");
eco=sc.nextInt();

System.out.print("Please enter your Management marks = ");
mang=sc.nextInt();

System.out.print("Please enter your Accountancy marks= ");
acc=sc.nextInt();
}

void putBcom()
{
putCollege();
System.out.println("Economic marks is = "+ eco);
System.out.println("Management marks is = "+ mang);
System.out.println("Accountancy marks is = "+ acc);

int per=(eco+mang+acc)/3;
System.out.println("your percentage is = "+ per+ "%");

if(per>=70)
{
System.out.println(" your addmission is confirm ");
}

else 
{
System.out.println("your addmission is not confirm ");
}

}
};


class BA extends College
{
int his,civ,geo;

BA()
{
System.out.print("Please enter your History marks = ");
his=sc.nextInt();

System.out.print("Please enter your Civics marks = ");
civ=sc.nextInt();

System.out.print("Please enter your Geography marks= ");
geo=sc.nextInt();
}

void putBA()
{
putCollege();
System.out.println("History marks is = "+ his);
System.out.println("Civics marks is = "+ civ);
System.out.println("Geography marks is = "+ geo);

int per=(his+civ+geo)/3;
System.out.println("your percentage is = "+ per+ "%");

if(per>=70)
{
System.out.println(" your addmission is confirm ");
}
else 
{
System.out.println("your addmission is not confirm ");
}
}
};

class Test
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int x;
System.out.println("Enter 1 for BTech addmission ,2 for Bcom addmission and 3 for BA addmission");
x=sc.nextInt();

if(x==1)
{
BTech bt=new BTech();
bt.putBtech();
}

else if(x==2)
{
Bcom bm=new Bcom();
bm.putBcom();
}

else if(x==3)
{
BA ba=new BA();
ba.putBA();
}

else
{
System.out.println("please Enter 1,2 or 3 keys only");
}
}
}

