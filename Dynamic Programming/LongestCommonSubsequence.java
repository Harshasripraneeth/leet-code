import java.util.*;
import java.math.*;

class LongestCommonSubsequence
 {
  String s;
  String s2;
  int len1;
  int len2;
  int dt[][];
  public LongestCommonSubsequence(String s1,String s2)
   {
    s = s1;
    this.s2 = s2;
    len1 = s1.length()+1;
    len2 = s2.length()+1;
    dt = new int[len2][len1];
    }

  public void calculate()
   {
    for(int row=0;row<len2;row++)
      dt[row][0]=0;
    
    for(int col=0;col< len1;col++)
      dt[0][col]=0;

    for(int row = 1;row<len2;row++)
     {
      for(int col = 1;col < len1;col++)
       {
         if(s2.charAt(row-1) == (s.charAt(col-1)))
           dt[row][col] = dt[row-1][col-1]+1;
         else
           dt[row][col] = Math.max(dt[row-1][col]
                                   ,dt[row][col-1]);
       }
     }
     
      System.out.println("longest common subsequence is   "+dt[len2-1][len1-1]);  
   }

  void display()
   {
    for(int row= len2-1,col = len1-1; col>0 && row >0;)
     {
      if(dt[row][col] == dt[row][col-1])
        col = col-1;
      else if (dt[row][col] == dt[row-1][col])
         row = row-1;
      else
       {
         System.out.print(s.charAt(col-1)+" ");
         row = row-1;
         col = col-1;
       } 
     }
   }
  }

  class Solution
   {
    public static void main(String ar[])
     {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the string");
      String s = sc.next();
      System.out.println("enter second String");
      String s1 = sc.next();
      LongestCommonSubsequence lcs = new LongestCommonSubsequence(s,s1);
      lcs.calculate();
      lcs.display();
     }
    }       