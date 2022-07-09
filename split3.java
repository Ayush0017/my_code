
class test
{
 public static void main(String args[]) 
{
 String srcStr= " Spit for reversing. Reverse the sentences in the paragraphs. For that, use the dot regex. Taken?";
 
//Splitting the string
 String[] arrStr = srcStr.split("\\.");
 String strRev = "";
 for(int i=arrStr.length-1;i>=0;i--)
{
 strRev = strRev + arrStr[i] + ".";
 
 }
 System.out.print("Source string: " + srcStr +"\n");
 System.out.print("The reversed string after split: " + strRev );
}
}