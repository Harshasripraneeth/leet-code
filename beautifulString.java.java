import java.util.*;
class exp
{
static Set<String> set = new HashSet<String>();
public static void main(String ar[])
{
String str = "ABC"; 
int n = str.length(); 
permute((str+"A"),0,n-1);
permute((str+"B"),0,n-1);
permute((str+"C"),0,n-1);
if( set.isEmpty())
System.out.println("-1");
else{ 
for(String s : set)
{
System.out.println(s);
} 
}
}
 static void permute(String str, int l, int r) 
    { 
        if (l == r) 
       {
       char c = str.charAt(0);
       boolean b=true;
       for(int i=1;i<str.length();i++)
       {
       if(c == str.charAt(i))
        {
       b=false;
       break;
        }
       else
       c=str.charAt(i);
       }
       if(b)
       set.add(str);
}
  else
   { 
    for (int i = l; i <= r; i++) 
    { 
    str = swap(str,l,i); 
    permute(str, l+1, r); 
   str = swap(str,l,i); 
   } 
   } 
   } 
  static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  
} 
  
  
 