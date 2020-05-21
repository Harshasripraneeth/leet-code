import java.util.*;
class SlidingMedian
{
int k;
int []nums;
public SlidingMedian(int k,int []nums)
{
this.k =k;
this.nums = nums;
partition();
}

void partition()
{
 int mid;
  int temp[] = new int[k];
 for(int i =0,j=k;j<=nums.length;i=i+1,j=j+1)
  {
   if(k%2!=0)
    {
      if(k==1)
       System.out.print(nums[i]+" ");
      else
        {
           int pos =i;
         for(int x=0;x<k;x++)
          {
           temp[x] =nums[pos];
           pos++; 
          }
        calculate(temp,false);
     }
    }
    else
     {
         int pos =i;
         for(int x=0;x<k;x++)
          {
           temp[x] =nums[pos];
           pos++; 
          }
        calculate(temp,true);
     }
    }
  }
  void calculate(int num[],boolean d)   
  {
   Arrays.sort(num);
    if(d)
     System.out.print((num[k/2]+num[(k/2)-1])/2.0 + " ");
    else
   System.out.print(num[k/2]+" ");
   // as per the position of the array.
  } 
 }

class Solution
 {
  public static void main(String ar[])
  {
   Scanner sc = new Scanner(System.in);
  System.out.println("enter the number of elements u need");
  int n = sc.nextInt(); 
  int num[] = new int[n];
  System.out.println("enter the elements");
  for(int i=0;i<n;i++)
   num[i] = sc.nextInt();
  System.out.println("enter the window size");
  SlidingMedian sm = new SlidingMedian(sc.nextInt(),num);
  }
 }