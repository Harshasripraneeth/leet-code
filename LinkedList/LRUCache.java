import java.util.*;
class Node
 {
  int data;
  Node prev;
  Node next;
  public Node(int data)
   {
    this.data = data;
    this.prev = null;
    this.next = null;
   }
   public Node()
   {
     this.next= this.prev =null;
   }
 }
class LRU
 {
  int capacity;
  Map <Integer,Node> map;
  Node head;
  Node tail;
  int currentCapacity;
  public LRU(int capacity) 
  {
   this.capacity = capacity;
   currentCapacity = 0;
   map = new HashMap();
   head = new Node();
   tail = new Node();
   head.prev = tail.next = null;
   head.next = tail;
   tail.prev = head;
  }
  int get(int key)
  {
   Node node = map.get(key);
   if(node == null)
    return -1;
   return node.data;
  }
  void put(int key,int data)
   {
    Node node = map.get(key);
    if(node == null)
     {
      node = new Node(data);
      Node ptr = head.next;
      head.next = node;
      ptr.prev = node;
      node.prev = head;
      node.next = ptr;
      map.put(key,node);
      currentCapacity++;
      if(currentCapacity > capacity)
       remove();
     }
    else
     {
      node.data = data;
      toFront(key,node);
     }
     //display();
   }
   void toFront(int key,Node node)
    {
     node.prev.next = node.next;
     node.next.prev = node.prev;
     node.prev = node.next = null;
     Node ptr = head.next;
      head.next = node;
      ptr.prev = node;
      node.prev = head;
      node.next = ptr;
      map.put(key,node);
    }
   void remove()
    {
     Node node = tail.prev;
     node.prev.next = tail;
     tail.prev = node.prev;
     node.next = node.prev = null;
     currentCapacity--;
    }
   /*void display()
    {
     Node node = head.next;
     while(node.next != tail)
     {
      System.out.print(node.data +" ");
      node = node.next;
     }
     System.out.print(node.data);
     System.out.println("");
    }
   */
  }
 
  class Solution
   {
    public static void main(String ar[])
     {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter capacity");
      int cap = sc.nextInt();
      LRU lru = new LRU(cap);
      while(true)
       {
        System.out.println("enter option \n 1.get\n 2.put \n other exit ");
        int op = sc.nextInt();
        switch(op)
         {
          case 1: System.out.println("enter the key");
                  int key = sc.nextInt();
                  System.out.println("the data for given key is  "+lru.get(key));
                  break;
         case 2: System.out.println("enter the key");
                  int key1 = sc.nextInt();
                 System.out.println("enter the data");
                  int data = sc.nextInt();
                 lru.put(key1,data);
                 break;
         default : System.exit(0);
        }
      }
    }
}
