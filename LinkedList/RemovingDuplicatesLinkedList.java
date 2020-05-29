import java.util.*;

class LinkedList
 {
  Node head;
  class Node
   {
    int data;
    Node next;
  
    public Node(int data)
     {
      this.data = data;
      this.next = null;
     }
   }
  Node insert(int data)
   {
    Node newnode = new Node(data);
    if(head == null)
     head = newnode;
    else
     {
      Node ptr = head;
      while(ptr.next != null)
       ptr = ptr.next;
     
      ptr.next = newnode;
     }
     return head;
   }

  void display()
   {
      Node ptr = head;
      while(ptr.next != null){
       System.out.print(ptr.data+" ");
       ptr = ptr.next;}
      System.out.print(ptr.data);
   }
   void remove(Node head)
    {
     Node ptr = head;
     Node prev = null;
     Set<Integer> set = new HashSet();
     while(ptr.next!=null)
     {
      if(set.contains(ptr.data))
       prev.next = ptr.next;
      else
       {
        set.add(ptr.data);
        prev = ptr;
       }
       ptr = ptr.next;
     }
   }
 }
class Solution
 {
  public static void main(String ar[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements");
    int n = sc.nextInt();
    System.out.println("enter the elements");
    LinkedList list = new LinkedList();
    
    for(int i=0;i<n;i++)
     {
      int temp = sc.nextInt();
      list.insert(temp);
     }
   System.out.println("before removing duplicates in the list");
    list.display();
    System.out.println("");
    System.out.println("After removing duplicates in the list");
    list.remove(list.head);
    list.display();
    
   }
 }