import java.util.*;
class hsp
{
public static void main(String ar[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the string");
String st = sc.nextLine();
int count=0,i=-1,end=0,pos=0,max=-1,e=0,p=0;
Set s = new HashSet();
for(char c : st.toCharArray())
{
i++;
if(!s.contains(c))
{
s.add(c);
end=i;
if(i==st.length()-1)
{
if(max < (i-pos))
{
p=pos;
e=end;
max=end-pos;
}
}
}
else
{
count++;
if(max < (i-pos))
{
p=pos;
e=end;
max=end-pos;
}
pos=i;
}
}
if(count==1)
System.out.println("the string is "+st.charAt(0)+" length is "+1);
else if((e==0 && end!=0)){
e=end;System.out.println("the string is "+st+" length is "+st.length());} 
else 
System.out.println("the string is "+st.substring(p,e+1)+" length "+(max+1));
}}