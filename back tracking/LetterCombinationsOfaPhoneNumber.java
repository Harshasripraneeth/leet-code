import java.util.*;
class LetterCombinationsOfaPhoneNumber
 {
  List<String> letters = Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz");

  List<String> result;
  String s;
  public LetterCombinationsOfaPhoneNumber(String s)
   {
   this.s =s;
   result = new ArrayList();
   }
 
 void calculate(int position,StringBuffer sb)
  {
   if( position == s.length())
   {
    result.add(sb.toString());
    return;
   }
   int index = s.charAt(position) - '0';
   for(char c: letters.get(index).toCharArray())
    {
     sb.append(c);
     calculate(position+1,sb);
     sb.deleteCharAt(sb.length()-1);
    } 
  }
}
 class Solution
  {
   public static void main(String ar[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the String");
     String s = sc.next();
     LetterCombinationsOfaPhoneNumber Lcpn = new LetterCombinationsOfaPhoneNumber(s);
    Lcpn.calculate(0,new StringBuffer());
    System.out.println(Lcpn.result);
    }
  }
 
