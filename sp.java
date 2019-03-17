import java.lang.*;
import java.util.*;
class sp
{
public static void main(String ar[])
{
Scanner sc= new Scanner(System.in);
String s;
int count=0,lp,rp,i;
System.out.println("enter your string");
s=sc.nextLine();
lp=s.indexOf('(');
i=-1;
if(lp==-1)
System.out.println("no substring");
else
{
count=0;
for(char c:s.toCharArray())
{
i++;
if(c=='(')
{
if(count<=0)
{
count=1;
lp=i;
}else count++;}
if(c==')')
{
count=count-1;
if(count==0)
{
System.out.println(s.substring(lp,i+1));
}
}}}
}
}