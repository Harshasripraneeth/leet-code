import java.util.Scanner;
class regmat
{
public static void main(String ar[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the string");
String s= sc.nextLine();
System.out.println("enter the dynamic string");
String s1= sc.nextLine();
boolean t;
t= reg(s,s1);
if(t)
System.out.println("the string can be aqcuired from the given pattern");
else
System.out,println("the string cannot be acquired from the given pattern");
}
static boolean reg(String s,String s1)
{
boolean t[][] = new boolean[s.length()+1][s1.length()+1];
t[0][0]=true;
int i,j;
for(i=0,j=1;j<=s1.length();j++)
t[i][j]=false;
for(j=0,i=1;i<=s.length();i++)
t[i][j]=false;
for(i=1;i<=s.length();i++)
{
for(j=1;j<s1.length();j++)
{
if(s.charAt(i-1) == s1.charAt(j-1))
{
t[i][j] = t[i-1][j-1];
}
if(s.charAt(j-1)== '.')
{
t[i][j] = t[i-1][j-1];
}
if(s.charAt(j-1)=='*')
{
t[i][j]=t[i][j-2];
if(s.charAt(i-1) == s1.charAt(j-2) || s1.chrAt(j-2))
t[i][j]= t[i-1][j];
}
}
}
return t[s.length()][s1.length()];
}
}