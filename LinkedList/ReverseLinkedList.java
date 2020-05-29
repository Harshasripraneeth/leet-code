import java.util.Scanner;
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
    Node reverse(Node head)
     {
     if(head == null || head.next == null) { 
            return head; 
        } 
         Node reverseList = reverse(head.next);  
        head.next.next = head; 
        head.next = null; 
        return reverseList;
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
    System.out.println("before reversing the list");
    list.display();
    System.out.println("");
    list.head = list.reverse(list.head);
    System.out.println("After reversing the list");
    list.display();
    
   }
 }