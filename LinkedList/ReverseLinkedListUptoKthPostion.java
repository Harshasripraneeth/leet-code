import java.util.Scanner;

  class LinkedList
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
    static LinkedList insert(LinkedList list,int data) 
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
  static LinkedList inslast(LinkedList list,int data)
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
   LinkedList list = new LinkedList();
   LinkedList result = new LinkedList();
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
    list = insert(list,ele);
    }// end of while loop.
   
   //code for reversing the linkedlist upto the given position.
   Node ptr = list.head;
   result = insert(result,ptr.data);
   i++;
   while(ptr.next != null)
    {
    ptr=ptr.next;
    if(i<n)
    result = inslast(result,ptr.data);
    if(i>=n)
     result.insert(result,ptr.data);
    i++;
   }

   //code for displaying the linkedlist.
   ptr= result.head;
   System.out.println(" the linked list is ");
   while(ptr.next !=null)
    {
     System.out.print(ptr.data+"->");
     ptr=ptr.next;
    }
   System.out.print(ptr.data);


  }
}
