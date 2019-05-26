import java.util.*;
class zigzag
{
public static void main(String ar[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the string");
String s= sc.nextLine();
System.out.println("enter the pattern number");
int n=sc.nextInt();
boolean inc=true;
StringBuffer sb = new StringBuffer();
Map <Integer,StringBuffer>map = new <Integer,StringBuffer> HashMap();
int pos=0;
for(char c: s.toCharArray())
{
if(pos==n) inc=false;
if(pos==1) inc=true;
if(inc) pos++; else pos--;
if(!map.containsKey(pos))
map.put(pos,new StringBuffer());
map.get(pos).append(c);
System.out.println(map.get(pos));
}
for(int i : map.keySet())
{
sb.append(map.get(i));
}
System.out.println("pattern is "+sb);
}}