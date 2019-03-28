import java.lang.*;
import java.util.*;
class subpalin
{
String s;
subpalin(String s)
{
this.s=s;
}
boolean palindrome(int start,int pos)
{
int i,j;
boolean pp=false;//return value
for(i=start,j=pos;i<(pos-start/2);i++,j--)
{
if(s.charAt(i)!=s.charAt(j))
{
pp=false;break;}
else
pp=true;
}
return pp;}
void strings(int start,int pos)
{
boolean lo;
int ni;//represents next index
do{
lo=palindrome(start,pos);
if(lo)
System.out.println(s.substring(start,pos+1)+"  "+ pos);
start++;
ni=s.indexOf(s.charAt(pos),start);
if(ni !=-1)
palindrome(ni,pos);
else
break;
} while(ni!=-1);
}
void check()
{
int i=-1;
for(char c:s.toCharArray())
{
i++;
if(s.indexOf(c)!=-1&& s.indexOf(c)!=i)
strings(s.indexOf(c),i);
}}}
class subpal
{
public static void main(String ar[])
{
String s;
Scanner sc=new Scanner(System.in);
System.out.println("enter your string");
s=sc.nextLine();
subpalin yoo= new subpalin(s);
yoo.check();
}}