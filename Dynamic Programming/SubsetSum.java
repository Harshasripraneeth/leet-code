import java.util.*;
class SubsetSum
{
  int num[];
  int value;
  boolean dt[][];
  public SubsetSum(int x[],int k)
   {
    num = x;
    value = k;
    dt = new boolean[x.length][k+1];
   }
  boolean calculate()
   {
    for(int row=0; row < num.length;row++)
      dt[row][0] = true;
    
    for(int col=1;col <= value;col++)
     {
      if(col == num[0])
        dt[0][col] = true;
      else
        dt[0][col] = false;
   }

   for(int row=1;row <num.length; row++)
    {
     for(int col =1;col <= value;col++)
      {
        if(col - num[row] >=0)
          dt[row][col] = dt[row-1][col- num[row]]  
                         ||dt[row-1][col];
        else
          dt[row][col] = dt[row-1][col];
      }
    }
   System.out.println("result is " + dt[num.length-1][value]);
   return dt[num.length-1][value];
  }

  void display()
   {
      for(int row = num.length-1,col = value; col>0;)
       {    
          if(row ==0)
            {
             System.out.print(num[0]);
             return;
            }
          if(dt[row][col] == dt[row-1][col])
            row = row-1;
          else
          {
           System.out.print(num[row]+" ");
           row = row-1;
           col = col - num[row]-1;
           } 
        }
   }
 }
 class Solution 
  {
   public static void main(String ar[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println(" enter the number of elements");
      int n = sc.nextInt();
      System.out.println("enter the elements");
      int num[] = new int[n];
      for(int i=0;i<n;i++)
       num[i]= sc.nextInt();
      System.out.println("enter key value");
      int k = sc.nextInt();
      SubsetSum sum = new SubsetSum(num,k);
      boolean b=sum.calculate();
      if(b)
       sum.display();
      else
       System.out.println("not possible");
     }
   }
