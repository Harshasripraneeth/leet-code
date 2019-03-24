import java.lang.*;
import java.util.*;
class llnew
{
public static void main(String ar[])
{
int sum=0,j=0,t=0,k,v,n,i=0,pos=0;
Scanner sc =new Scanner(System.in);
System.out.println("enter number of linked lists you want");
n=sc.nextInt();
int count[]= new int[n];
for(i=0;i<n;i++)
count[i]=0;
LinkedList list[]=new LinkedList[n];
for(i=0;i<n;i++)
{
list[i]=new LinkedList();
k=1;
System.out.println("enter your"+(i+1)+"linked list please enter 100 to stop");
while(k!=100)
{
System.out.println("enter your element to add");
v=sc.nextInt();
list[i].add(v);
count[i]++;
System.out.println("if u want to stop adding elements press 100 or any to continue");
k=sc.nextInt();
}
}
System.out.println("the two linked lists are: ");
for(i=0;i<n;i++)
System.out.println(list[i]);
System.out.println("merging the linked lists:");
for(i=0;i<n;i++)
sum=sum+count[i];
j=0;t=0;
do
{
for(i=0;i<n;i++)
{
if(i==0)
{
j++;pos++;continue;}
else
list[0].add(pos,list[i].get(t));
pos++;j++;
}
t++;}while(j<sum);


System.out.println(list[0]);
}
}
