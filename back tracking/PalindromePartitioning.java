import java.util.*;
class PalindromePartitioning
 {
  String s;
  public PalindromePartitioning(String s)
   {
    this.s = s;
    List<List<String>> result = new ArrayList();
    List<String> progressList = new ArrayList();
    calculate(0,result,progressList);
    display(result);
   }
 void calculate(int position,List<List<String>> result,List<String> progressList)
    {
     if( position == s.length())
       result.add(new ArrayList(progressList));
      
      for(int i= position; i<s.length();i++)
       {
         String temp = s.substring(position,i+1);
         if(isPalindrome(temp))
          {
           progressList.add(temp);
           calculate(i+1,result,progressList);
           progressList.remove(progressList.size()-1);
           }
       }
    }
     
    boolean isPalindrome(String x)
     {
      for(int i=0,j=x.length()-1;i<x.length()/2;i++,j--)
       {
        if(x.charAt(i) != x.charAt(j))
          return false;
       }
      return true;
     }
    void display(List<List<String>> result)
     {
      for(List<String> list : result)
      System.out.println(list); 
     }
   }
  class Solution
   {
    public static void main(String ar[])
     {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      PalindromePartitioning pp = new PalindromePartitioning(s);
     }
   }

  
