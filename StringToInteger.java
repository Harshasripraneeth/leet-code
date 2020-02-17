import java.lang.*;
import java.util.Scanner;
class Convert
{
void convertToInteger(String string)
 { 
  String string ;
  this.string = string;
  char op=' ';
  boolean t=false; 
  int i=0,number=0;
   for(char c : string.toCharArray())
    {
      if(!t) // to check the operator is encoutered for the 
               //first time.
        {
         if(c=='+' || c=='-')
         {
         op=c;t=true;
         }
       }

       if(Character.isDigit(c)) // for checking the integers.
        {
       if(t)
       num= ( num*10)+Integer.parseInt(String.valueOf(c));
       
        } 
      else if(Character.isAlphabetic(c))
       break;
        
    }
  System.out.println("the number is ");
  if(t) 
  System.out.print(op);
  
  System.out.print(num);
 }
}
class StringToInteger
{
public static void main(String ar[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the string: ");
String s = sc.nextLine();
Convert convert = new Convert();
convert.convertToInteger(s);
}} 
