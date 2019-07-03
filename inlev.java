import java.util.Scanner;
class inlev
{
public static void main(String ar[])
{
Scanner sc = new Scanner(System.in);
int i=0,j=0,k=0;
System.out.println("enter the string");
String s = sc.nextLine();
System.out.println("String 2");
String s1= sc.nextLine();
System.out.println("result");
String res= sc.nextLine();
boolean st=true,st1=false,resl=false;
if(res.length() != s.length()+s1.length())
{
resl=false;
}
else
{
while(i<s.length() && j<s1.length())
{
if(st)
{
if(s.charAt(i) == res.charAt(k))
{
i++;k++;
}
else
{
st=false;
if(s1.charAt(j)==res.charAt(k))
st1=true;
else{resl=true;
break;}
}
}
else if(st1)
{
if(s1.charAt(j) == res.charAt(k))
{
j++;k++;
}
else
{
if(s.charAt(i)==res.charAt(k))
st=true;
else{
resl=true;
break;
}
st1=false;
}
}
else{
resl=true;break;
}
}
}
if(resl)
System.out.println("false");
else
System.out.println("true");
}
}
