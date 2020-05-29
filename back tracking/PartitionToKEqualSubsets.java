import java.util.*;
class PartitionToKEqualSubsets
  {
   int num[];
   int avg;
   public PartitionToKEqualSubsets(int num[], int avg)
    {
     this.num = num;
     this.avg = avg;    
    }
  boolean calculate(int pos,int sum,boolean []b,List<List<Integer>>result,List<Integer> progress,int k)
   {
     if(k==0)
      {
      System.out.println(result);
      return true;
      }
     if( sum == avg)
      {
       result.add(new ArrayList(progress));
       progress.clear();
       calculate(0,0,b,result,progress,k-1);
       return true;
      }
      for(int i= pos;i<num.length;i++)
       {
        if( !b[i] && sum+num[i] <= avg)
        {
         b[i] = true;
         progress.add(num[i]);
         if(calculate(i+1,sum+num[i],b,result,progress,k))
          return true;
         b[i] = false;
         progress.remove(progress.size()-1);
        }
      }
    return false;
   }
  }
class Solution
 {
  public static void main(String ar[])
   {
    Scanner sc = new Scanner(System.in);
 System.out.println("enter number of elements u need to enter");
    int n = sc.nextInt();
    int num[] = new int[n];
    System.out.println("enter the elements");
    int sum =0;
    for(int i=0;i<n;i++)
     {
      int temp = sc.nextInt();
      sum = sum+temp;
      num[i] = temp;
     }
    System.out.println("enter the number to partition the set");
    int k = sc.nextInt();
    if( sum % k ==0)
     {
      boolean b[] = new boolean[n];
      Arrays.fill(b,false);
      PartitionToKEqualSubsets Ptkes = new PartitionToKEqualSubsets(num,sum/k);
      List<List<Integer>> result = new ArrayList();
      List<Integer> temp =new ArrayList<Integer>();
      Ptkes.calculate(0,0,b,result,temp,k);
     System.out.println(result);
     }
    else
 System.out.println("cannot be partitioned into equal subsets");
   }
 }
