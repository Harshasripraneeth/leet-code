import java.io.*;
import java.util.*;
class KMP
 {
  String s;
  String sub;
  int table[];
  int subLength;
  public KMP(String s, String sub)
   {
    this.s =s;
    this.sub = sub;
    subLength = sub.length(); 
    table = new int[sub.length()];
    calculateTable();
   }
  void calculateTable()
   {
    int start =0;
    table[0]=0;
    for(int i=1;i<sub.length();i++)
     {
      if(sub.charAt(i) == sub.charAt(start))
       {
        table[i] = table[i-1]+1;
        start++;
       }
      else
       {
       if(sub.charAt(i) == sub.charAt(0))
        {
         table[i] =1;
         start=1;
         }
       else
        {
          table[i] =0;
          start=0;
        }
       }
     }
     for(int i : table)
     System.out.print(i+" ");
     
   }
   void calculate()
    {
     int pointer =0;
     int index =-1;
     List<Integer> result = new ArrayList();
     for(char c : s.toCharArray())
      {
       index++;
       if( c == sub.charAt(pointer))
         pointer++;
       else
       {
        pointer = table[pointer];
        if(sub.charAt(pointer) == c)
         pointer++;
        else
         pointer =0;
       }
       if(pointer == sub.length()) 
       {
       result.add(index);
       pointer = table[pointer-1];
       }
      }
    System.out.println("the index where the substring is occured");
    for(int i : result)
     System.out.print(i+" ");
    }
 }
 class Solution
  {
   public static void main(String at[])
    {
     try
      {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the string");
       String s = br.readLine();
       System.out.println("enter the substring");
       String sub = br.readLine();
       KMP kmp = new KMP(s,sub);
       kmp.calculate();
      }
      catch(Exception e)
       {}
    }
  }
