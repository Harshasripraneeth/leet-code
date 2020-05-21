import java.util.*;
import java.io.*;
class EditDistance
 {
  char s[];
  char s1[];
  int dt[][];
  int len;
  int len1;
  public EditDistance(char s[],char s1[])
  {
   this.s =s;
   this.s1 = s1;
   len = s.length+1;
   len1 = s1.length+1;
   dt = new int[len][len];
  }
  
  void calculate()
   {
    for(int row =0;row < len1;row++)
     dt[row][0] = row;
    
    for(int col =0;col<len;col++)
     dt[0][col] = col;

    for(int row=1; row<len1;row++)
     {
      for(int col =1;col<len;col++)
       {
        if(s1[row-1] == s[col-1])
           dt[row][col] = dt[row-1][col-1];
        else
          dt[row][col] = Math.min(dt[row][col-1],
Math.min(dt[row-1][col],dt[row-1][col-1]))+1;

       }
     }
    System.out.println("the minimum steps to edit the string is: "+dt[len1-1][len-1]);    }
 }

class Solution
 {
  public static void main(String ar[])
   {
    try
     {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
      String s =  br.readLine();
      String s1 = br.readLine();
      EditDistance editDistance = new EditDistance(s.toCharArray(),s1.toCharArray());
      editDistance.calculate();
      }
     catch(Exception e){}
   }
 } 