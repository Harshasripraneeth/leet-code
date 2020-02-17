import java.util.*;
 class Calculate
  {
   int target;
  
 public Calculate(int target)
    {
     this.target = target;
    }

   public void printSets(int[] num)
    {
     int n = num.length;
     int res[] = new int[n];
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the how many elements should be present in the pair");
     int pair = sc.nextInt();
     if( pair > n)
      System.out.println("enter valid number of pair of elements");
     else
     calculateSubSets(num,res,0,n-1,0,pair);
    }

    void calculateSubSets(int[] num,int[]data,int start,int end,int index,int r)
    {
     if(index == r)
      {
       int sum=0;
       int c[]= new int[end+1];
       for(int i=0;i<r;i++)
       sum =sum+data[i];
       if(sum == target)
        {
         for(int i=0;i<r;i++)
         System.out.print(data[i]+" ");
         System.out.println();
        }
      }
    for(int i =start;i<=end && ((end-i+r) >=(r-index));i++)
     {
      data[index] = num[i];
      calculateSubSets(num,data,i+1,end,index+1,r);
     }
    }
  }
 
class SubSets
  {
  public static void main(String ar[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of elements in the array");
    int n = sc.nextInt();
    int num[] = new int[n];
    for(int i=0;i<n;i++)
     {
      num[i] = sc.nextInt();
     }
   System.out.println("enter the target number");
   int target=sc.nextInt();
   Calculate calculate = new Calculate(target);
    calculate.printSets(num);  
  }
}
