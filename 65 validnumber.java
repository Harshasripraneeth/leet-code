import java.util.Scanner;
class validnumber
{
public static void main(String ar[])
{
Scanner sc= new Scanner(System.in);
String s;
int al=0;
boolean kk=true,res=true;
System.out.println("enter the string");
s= sc.nextLine();
for(int i=0; i< s.length();i++)
{
if(s.charAt(i) == '.')
{
if(al == 1){
res=false;break;}
else if(kk)
kk=false;
else
{res=false;break;
}}
else if(s.charAt(i)=='e')
{
if(i!=s.length()-1 && al ==0)
al=1;
else{
res=false;break;}
}
else if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' )
{
if(i!=s.length()-1){
if(s.charAt(i+1) == '+' || s.charAt(i+1) == '-' || s.charAt(i+1) == '*' || s.charAt(i+1) == '/' )
{res=false;break;}
}}
else if(Character.isAlphabetic(s.charAt(i)) && s.charAt(i)!='e') {res=false;break;}
}
if(res)System.out.println("valid number");
else System.out.println("invalid number");
}}







