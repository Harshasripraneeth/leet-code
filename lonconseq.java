import java.util.*;
class lonconseq
{
public static void main(String ar[])
{
Scanner sc = new Scanner(System.in);
Map <Integer,Integer> m = new <Integer,Integer>HashMap();
System.out.println("enter 10052 to stop entering");
int n;
String s;
int max=0;
while(true)
{
System.out.println("enter the string");
n= sc.nextInt();
if(n==10052)
break;
else
{
s=String.valueOf(n);
if(!m.containsKey(s.length()))
{
m.put(s.length(),1);
}
else
{
m.replace(s.length(),m.get(s.length())+1);
}
}
}
for(int i : m.keySet())
{
if(max < m.get(i))
max=m.get(i);
}
System.out.println("the longest consecutive sequence is "+max);
}
}