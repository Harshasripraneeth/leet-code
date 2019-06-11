import java.lang.*;
import java.util.Scanner;
class xx
{
void drive()
{ 
Scanner sc = new Scanner(System.in);
System.out.println("enter the string: ");
String s = sc.nextLine();
char op=' ';
boolean t=false;
int i=0,num=0;
for(char c : s.toCharArray())
{

if(Character.isDigit(c))
num= ( num*10)+Integer.parseInt(String.valueOf(c));
else if(Character.isAlphabetic(c))
break;
if(c=='+' || c=='-')
{
op=c;t=true;
}
}
System.out.println("the number is ");
if(t) System.out.print(op);
System.out.print(num);
}
}
class exp
{
public static void main(String ar[])
{
xx x= new xx();
x.drive();
}} 
