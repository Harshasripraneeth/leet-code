import java.lang.*;
import java.util.*;
class roman 
{
public static void main(String ar[])
{
int n,i=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter your number");
n=sc.nextInt();
while(n>0)
{
if(n>=1000)
{
System.out.print("M");
n=n-1000;
}
else if(n>=500)
{
System.out.print("D");
n=n-500;
}
else if(n>=100)
{
System.out.print("C");
n=n-100;
}
else if(n>=50)
{
System.out.print("L"); n=n-50;
}
else if(n>=10)
{
System.out.print("X");
n=n-10;
}
else if(n==9)
{
System.out.print("IX");
n=n-9;
}
else if(n>=5 && n!=9)
{
System.out.print("V");
n=n-5;
}
else if(n==4)
{
System.out.print("IV");
n=n-4;
}
else if(n>=1)
{
System.out.print("I");
n=n-1;
}
}
}}