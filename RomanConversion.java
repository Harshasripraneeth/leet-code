import java.lang.*;
import java.util.*;
 class Roman 
  {
   public static void main(String ar[])
    {
    int number,i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number");
    number=sc.nextInt();
    while(number>0)
     {
      if(number>=1000)
       {
        System.out.print("M");
        number=number-1000;
       }
      else if(number>=500)
       {
        System.out.print("D");
        number=number-500;
       }
       else if(number>=100)
        {
        System.out.print("C");
        number=number-100;
        }
       else if(number>=50)
        {
        System.out.print("L"); number=number-50;
        }
       else if(number>=10)
        {
         System.out.print("X");
         number=number-10;
        } 
       else if(number==9)
        {
        System.out.print("IX");
        number=number-9;
        }
        else if(number>=5 && number!=9)
         {
         System.out.print("V");
         number=number-5;
         }
        else if(number==4)
          {
         System.out.print("IV"); 
         number=number-4;
         }
        else if(number>=1)
         {
         System.out.print("I");
         number=number-1;
         }
      }
    }
  }