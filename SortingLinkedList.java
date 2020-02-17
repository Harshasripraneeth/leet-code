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
          data=d;
          next=null;
         }
      }

   //inserting a record into linkedlist.
   static linkedlist insert(linkedlist list,int data)
     {
     Node newnode = new  Node(data);
     newnode.next=null;
     if(list.head == null)
     list.head = newnode; 
     else
      {
       Node ptr = list.head;
       while(ptr.next!=null)
       ptr=ptr.next;
       ptr.next=newnode;
      }
     return list;
    } 
   // end of the function.

 public static void main(String ar[])
  {
   LinkedList list = new LinkedList();
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the number of elements");
   int n = sc.nextInt();
   int ele;
   for(int i=0;i<n;i++)
    {
     ele=sc.nextInt();
     list= insert(list,ele);
    }

   Node ptr=list.head;  //temporary Node.
   Node temp= list.head; // temporary Node.
   boolean p=true;
   while(ptr.next!= null)
   {

    //to change the head pointer.
    if(p)
     {
      list.head=list.head.next;
      temp=list.head.next;
      ptr.next=temp;
      list.head.next=ptr;
      p=false;
      ptr=ptr.next;
     }
   else
    {
    /*nodes ptr,ptr1,temp all are used to arrange the addresses 
       of the nodes. */

    Node ptr1=list.head;

    while(ptr1.next!=ptr)
    ptr1=ptr1.next;

    temp=ptr.next;
    ptr1.next=temp;
    ptr.next=temp.next;
    temp.next=ptr;
     
    //end of the list.
    if(ptr.next==null)
    break;

    ptr=ptr.next;   
    
    }
  }
  ptr=list.head;
  System.out.println(list.head);

  //for displaying the list.
  while(ptr.next!=null)
   {
    System.out.print(ptr.data+"->");ptr=ptr.next;
   }
   System.out.print(ptr.data); 
  }
}