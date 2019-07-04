import java.util.Scanner;
class linkedlist
{
Node head;
static class Node
{
int data;
Node next;
Node(int d)
{
data=d;next=null;
}
}
static linkedlist insert(linkedlist list,int data)
{
Node newnode = new Node(data);
newnode.next=null;
if(list.head == null)
{
list.head=newnode;
}
else
{
Node ptr = list.head;
while(ptr.next!=null)
ptr=ptr.next;
ptr.next = newnode;
}
return list;
}
static linkedlist inslast(linkedlist list,int data)
{
Node newnode = new Node(data);
newnode.next=null;
if(list.head == null)
{
list.head=newnode;
}
else
{
newnode.next=list.head;
list.head=newnode;

}
return list;
}

public static void main(String ar[])
{
linkedlist l = new linkedlist();
linkedlist l1 = new linkedlist();
Scanner sc = new Scanner(System.in);
System.out.println("enter the kth node number to reverse ");
int n= sc.nextInt();
int i=0;
System.out.println("enter the elements u need press 6789 to stop");
int ele=0;
while(true)
{
System.out.println("enter the element");
ele = sc.nextInt();
if(ele == 6789)
break;
else
l = insert(l,ele);
}
Node ptr = l.head;
l1 = insert(l1,ptr.data);
i++;
while(ptr.next != null)
{
ptr=ptr.next;
if(i<n)
l1 = inslast(l1,ptr.data);
if(i>=n)
l1.insert(l1,ptr.data);
i++;
}
ptr= l1.head;
System.out.println(" the linked list is ");
while(ptr.next !=null)
{
System.out.print(ptr.data+"->");
ptr=ptr.next;
}
System.out.print(ptr.data);
}
}
