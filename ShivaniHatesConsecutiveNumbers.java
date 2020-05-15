import java.util.*;
import java.math.*;
 class Solve
  {
   int num[];
   public Solve(int []values)
    { 
     num = values;
     getSolution();
    }

  void getSolution()
   {
    int result =0;
    int fi =0;
    for(int i=1;i<22;i++) 
     {
      if(num[i] == 0)
       {
        if( (i-fi)!= 1)
         {
          result = result + calculate( fi,i);
          fi =i;
         }
       }
     }
    System.out.print("result is "+result);
  }

 int calculate(int x, int y)
  {
   int temp=0;
   int temp1=0;
   if(x-y!=1)
    {
     for(int i = x+1;i<y;i= i+2) 
      {
       temp1 = temp1+(i * num[i]); 
      }
      for(int i = x+2;i<y;i= i+2) 
      {
       temp = temp +(i * num[i]); 
      }
    return Math.max(temp,temp1);
   }
   return num[x+1];
  }
}// end of class

class Soution
 {
  public static void main(String ar[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter number of elements");
   int n = sc.nextInt();
   int num[] = new int[22];
   Arrays.fill(num,0);
   int temp;
   System.out.println("enter elements");
   for(int i=0;i<n;i++)
    {
     temp = sc.nextInt();
     num[temp]++;
    }
    Solve solve = new Solve(num);
  }// end of main.
}