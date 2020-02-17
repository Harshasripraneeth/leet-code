import java,util.Scanner;
class BinaryConversion
{
  public static void main(String ar[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    Convert convert = new Convert();
    convert.Conversion(n);
  }
}

class Convert
 {
   //converts given number to binary number.

   void Conversion(int number) 
    {
     int result=0,remainder;
    while(number > 0)
     {
      remainder = number % 2;
      if(remainder ==0 )
       result = result*10;
      else
       res=result + (remainder*10);
      number = number/2;
    }
   System.out.println("binary number is "+result);
   }
 }
