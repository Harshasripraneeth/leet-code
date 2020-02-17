import java.util.*;
class Zigzag
{
public static void main(String ar[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the string");
String string= sc.nextLine();
System.out.println("enter the pattern number");
int n=sc.nextInt();
boolean inc=true;
StringBuffer sb = new StringBuffer();
Map <Integer,StringBuffer>map = new <Integer,StringBuffer> HashMap();
int pos=0;

//performs arranging the pattern according to the given pattern 
//number.

 for(char c: string.toCharArray())
  {
   if(pos==n) inc=false;

   if(pos==1) inc=true;

   if(inc) pos++; 
    
   else pos--;

   if(!map.containsKey(pos))
   map.put(pos,new StringBuffer()); // inserting the Strings           
                                    //according to the position
   map.get(pos).append(c);

   System.out.println(map.get(pos));
  }
  for(int i : map.keySet())
    {
   sb.append(map.get(i));// appending the contents of 
                         //StringBuffer to get the final String.
   }
  System.out.println("String according to the given pattern is "+sb);
 }

}