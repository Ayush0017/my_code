class test 
{
public static void main(String args[])
 {
 String strToRev = "Reverse me";               
 char[] strArr= strToRev.toCharArray();        
 String strRev = "";
 for(int x = strArr.length -1; x>=0; x--)
{
 strRev = strRev + strArr[x];
 }
 System.out.print("Original String: " + strToRev +"\n" );
 System.out.print("The reversed string: " + strRev );
 }
 }

