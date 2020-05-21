import java.util.*;
class Solution
 {
  public static void main(String ar[])
   {
    Scanner sc = new Scanner(System.in);
String s = sc.next();
IpAdrresses ip = new IpAdrresses(s);
   }
 }
 class IpAdrresses
  {
   private String s;
   public IpAdrresses(String s)
    {
     this.s = s;
     List<String> result = new ArrayList();  
     calculate(0,0,new int[4],result);
     display(result);
    }
   void calculate(int position,int curSegment,int[]segresults,List<String> result)
    {
      if(curSegment == 4 && position == s.length())
       {
        result.add(getFormatedString(segresults));
       }
       else if(curSegment == 4) return;
        for (int length = 1; length <= 3 && position + length <=   s.length(); length++) 
         {
  int lastIndex = position + length;
  String segmentString = s.substring(position, lastIndex);
int value = Integer.parseInt(segmentString);
if (value > 255 || length >= 2  && segmentString.charAt(0) == '0') 
 {
  break;
 }
      segresults[curSegment] = value;
      calculate(position + length,curSegment + 1,segresults,result);
       }
   }
   String getFormatedString(int[] segresults)
    {
     String x ="";
     for(int i=0;i<3;i++)
      x= x+segresults[i]+".";
     x= x+segresults[3];
     return x;
    }
   void display(List<String> result)
    {
     if(result.isEmpty())
      System.out.println("not found");
     else
      {
      for(String x : result)
       System.out.println(x);
      }
    }
   }