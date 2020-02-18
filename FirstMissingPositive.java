import java.util.Scanner;
import java.util.Arrays;
 class FirstMissingPositive
  {
   public static void main(String ar[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number of elements to enter");
     int n= sc.nextInt();
     int j=1;
     System.out.println("enter the elements");
      int num[] = new int[n];
     for(int i=0;i<n;i++)
      {
        num[i] = sc.nextInt();
      }
     Arrays.sort(num);
     for(int i : num)
      {
       if( i>0)
        {
         if(i!=j)
           {
          System.out.println("first missing positive is " +j);break;
           }
         else
          j++;

       }
     }
   }
}
