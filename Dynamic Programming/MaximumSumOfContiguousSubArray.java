import java.util.*;
import java.math.*;

class MaximumSumOfContiguousSubArray
 {
   private int index;
   private int result;
   private int num[];
   public MaximumSumOfContiguousSubArray(int num[])
    {
     this.num = num;
    }
  void calculate()
   {
     result = num[0];
     int sum    = result;
     for(int i=1;i<num.length;i++)
      {
        sum = Math.max(num[i],sum+num[i]);
       if(result < sum)
        {
         index = i;
         result = sum;
        }
      }
     System.out.println("maximum sum of contiguous sub array is "+ result);
    }

  void display()
   {
    System.out.println("the sub array is: ");
    int temp = result;
    int lastIndex = index;
    while(temp > 0)
     {
      int number = num[lastIndex];
      System.out.print(number+" ");
      temp = temp - number;
      lastIndex--;
     }
   }
 }
 class Solution
  {
    public static void main(String ar[])
     {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter number of elements u need to enter");
      int n = sc.nextInt();
      System.out.println("enter the elements");
      int num[] = new int[n];
      for(int i =0;i<n;i++)
       num[i] = sc.nextInt();
      MaximumSumOfContiguousSubArray solve = new MaximumSumOfContiguousSubArray(num);
      solve.calculate();
      solve.display();
     }
  }