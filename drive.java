import java.util.Scanner;
class linkedlist
{
node head;

static class node
{
int data;
node next;
node(int d)
{
data=d;
next=null;
}
}
static linkedlist insert(linkedlist list,int data)
{
node newnode = new  node(data);
newnode.next=null;
if(list.head == null)
list.head = newnode;
else
{
node ptr = list.head;
while(ptr.next!=null)
ptr=ptr.next;
ptr.next=newnode;
}
return list;
}
public static void main(String ar[])
{
linkedlist list = new linkedlist();
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of elements");
int n = sc.nextInt();
int ele;
for(int i=0;i<n;i++)
{
ele=sc.nextInt();
list= insert(list,ele);
}
node ptr=list.head;
node temp= list.head;
boolean nn=true;
while(ptr.next!= null)
{
if(nn){
list.head=list.head.next;
temp=list.head.next;
ptr.next=temp;
list.head.next=ptr;
nn=false;
ptr=ptr.next;
}
else
{
node ptr1=list.head;
while(ptr1.next!=ptr)
ptr1=ptr1.next;
temp=ptr.next;
ptr1.next=temp;
ptr.next=temp.next;
temp.next=ptr;
if(ptr.next==null)
break;
ptr=ptr.next;
}
}
ptr=list.head;
System.out.println(list.head);
while(ptr.next!=null)
{
System.out.print(ptr.data+"->");ptr=ptr.next;
}
System.out.print(ptr.data);
}
}