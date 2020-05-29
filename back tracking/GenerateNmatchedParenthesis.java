import java.util.*;
class GenerateNmatchedParenthesis
 {
   static void calculate(String s,int open,int close)
    {
     if( open == 0 && close ==0)
      {
       System.out.println(s);
       return;
       }
     
     if(open >0)
     {
      s= s+"(";
      calculate(s,open-1,close);
      s= s.substring(0,s.length()-1);
     }
     if( open < close)
      {
       s= s+")";
       calculate(s,open,close-1);
      }
   }
}
class Solution
 {
  public static void main(String ar[])
   { 
    GenerateNmatchedParenthesis Gnmp = new GenerateNmatchedParenthesis();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of matching parenthesis");
    int num = sc.nextInt();
    Gnmp.calculate(new String(),num,num);
   }   
 }
