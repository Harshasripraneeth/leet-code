     import java.util.Scanner;
     class MergeKSortedLists 
     {  
     public static Node merge(Node a, Node b)  
       {  
        Node result = null;  
        if (a == null)  
            return b;  
        else if(b == null)  
            return a;  
        if(a.data <= b.data)  
        {  
            result = a;  
            result.next = merge(a.next, b);  
        }  
        else
        {  
            result = b;  
            result.next = merge(a, b.next);  
        }  
    
        return result;  
       }    
      public static Node mergeKLists(Node arr[], int last)  
       {    
        while (last != 0)  
        {  
            int i = 0, j = last;    
            while (i < j)  
            {                  
                arr[i] = merge(arr[i], arr[j]);    
                i++; 
                j--;    
                if (i >= j)  
                    last = j;  
            }  
        }  
    
        return arr[0];  
       } 

     static Node insert(Node list,int data)
     {
     Node newnode = new  Node(data);
     newnode.next=null;
     if(list == null)
     list = newnode; 
     else
      {
       Node ptr = list;
       while(ptr.next!=null)
       ptr=ptr.next;
       ptr.next=newnode;
      }
     return list;
    } 
   
    public static void printList(Node node)  
    {  
        while (node != null)  
        {  
            System.out.print(node.data+" "); 
            node = node.next;  
        }  
    }  
  
    public static void main(String args[]) 
      { 
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the number of lists to enter");
       int n= sc.nextInt();
       System.out.println("enter the number of elements that should be present in the list");
       int k = sc.nextInt();
        Node arr[]=new Node[n]; 
        for(int i=0;i<n;i++)
        {
        System.out.println("enter the list "+(i+1));
        for(int j=0;j<k;j++)
        {
       
        arr[i] = insert(arr[i],sc.nextInt());
        }
        }
        Node head = mergeKLists(arr, n - 1);  
        printList(head);  
    } 
} 
    
class Node 
{ 
    int data; 
    Node next; 
    Node(int data) 
    { 
        this.data=data; 
    } 
}