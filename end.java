import java.util.Scanner;

class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String str[] = new String [5];
        String str2;
      

        System.out.println("Please enter names of your group members (only 5 members): ");
        for (int i = 0; i<5; i++)
        {
            str[i] = sc.nextLine();

        }
       
        System.out.println("Wirte a common last name you want find in list");
        str2=sc.nextLine();
        int p=0;
        for (int i=0;i<5;i++)
         {
        if(str[i].endsWith(str2))
        {
           p++;
        }
       
       }
      System.out.println(p);
    }
}