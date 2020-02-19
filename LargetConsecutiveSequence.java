import java.util.*;

/* Program to Find the length of LargestConsecutiveSequence of integers present in given array*/
class LargetConsecutiveSequence
 {
  int find(int num[])
   {
    int res=0;
    //we are using HashSet for indexing of an element.
    Set <Integer>set = new HashSet<Integer>();
    for(int i : num)
     set.add(i);
    for(int i=0; i<num.length;i++)
     {
      //if the given element is starting of the sequence.
      if(!set.contains(num[i]-1))
       {
        int j=num[i];
        
       //iterate until the consecutive number is present int the set.
        while(set.contains(j))
          j++;
       
        int temp = j-num[i];
        if( res < temp)
          res = temp;
        }
      }
      return res;
      }
    }

     class Solution
      {
       public static void main(String ar[])
        {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number of elements u need to enter");
         int n = sc.nextInt();
         int num[] = new int[n];
         for(int i=0;i<n;i++)
           num[i] = sc.nextInt();
               
         LargetConsecutiveSequence lonconseq = new LargetConsecutiveSequence();
        int res= lonconseq.find(num);
        System.out.println("the largest consecutive sequence length is "+ res);
        }
       }