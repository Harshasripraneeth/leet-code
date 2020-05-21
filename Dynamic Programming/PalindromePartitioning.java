import java.io.*;
class PalindromePartitioning
 {
  char[] s;
  int result[];
  int length;
  boolean dt[][];
  public PalindromePartitioning(char[] string)
  {
   s =string;
   length = s.length;
   result= new int[length];
   dt = new boolean[length][length];
  }
  void calculate()
   {
     for(int row =0;row < length;row++)
      dt[row][row] = true;
      
    for(int len =2;len<=length;len++)
     {
      for(int row=0;row < length-len+1;row++)
       {
        int col = row+len -1;
        boolean equal = (s[row] == s[col]);
        if( len == 2)
         dt[row][col] = equal;
        else 
         dt[row][col] = (equal && (dt[row+1][col-1]));
       }
     }
   for (int col = 0; col < length; col++) 
    { 
     if(dt[0][col] == true) 
        result[col] = 0; 
     else 
      { 
       result[col] = Integer.MAX_VALUE; 
       for (int row = 0; row < col; row++) 
        { 
        if(dt[row + 1][col] == true && 1 + result[row] < result[col]) 
           result[col] = 1 + result[row]; 
        } 
       } 
     } 
System.out.println("number of partitions: "+result[length-1]); 
display();
  }
void display()
 {
  for(int i = length-1;i>=0;)
   {
    if(i==0)
     {
     System.out.print(s[i]);
     break;
     }
   else if(result[i] == (result[i-1]+1)){
     System.out.print(s[i]+" ");i--;}
    else
     {
      int temp = result[i]-1;
      while(result[i] != temp && i >=0)
         System.out.print(s[i--]);
      System.out.print(" ");
     }
   }
 }
}
 class Solution
  {
   public static void main(String ar[])
    {
     try
      {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s = br.readLine();
       PalindromePartitioning pp = new PalindromePartitioning(s.toCharArray());       pp.calculate();
      }
     catch(Exception e)
      {}
    }
  }
