import java.util.Scanner;
class sub
{
int n;
int pos=0;
Scanner sc= new Scanner(System.in);
sub(int n)
{
this.n=n;
}
String str,temp;
void enter()
{
int pos=0,i;
StringBuilder sb= new StringBuilder();
System.out.print("enter the main string: ");
str= sc.nextLine();
System.out.println("enter the sub string");
for(i=0;i<n;i++)
{
sb.append(sc.nextLine());
}

i=0;
do
{
i=str.indexOf(String.valueOf(sb),pos);
if(i==-1)
{
System.out.println("scanning is done");
break;}
System.out.println(i);
pos=i;
pos++;
}while(i!=-1 || pos<str.length());
}}
class leet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the number of string u want to enter");
n= sc.nextInt();
sub s= new sub(n);
s.enter();
}
}