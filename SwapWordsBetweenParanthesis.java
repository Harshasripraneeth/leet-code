import java.util.*;

class Solve
 {
  public static void main(String ar[])
   {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    StringBuffer sb = new StringBuffer(s);
    LinkedList<Integer> list = new LinkedList();
    int pos =-1;
    int fi;
    for(char c : s.toCharArray())
     {
       pos++;
       if( c == '(')
        {
         list.push(pos);
        }
       else if( c== ')')
        {
         fi = list.pop();
          StringBuffer sb1 = new StringBuffer(s.substring(fi+1,pos));
        System.out.println("want : "+sb1.toString());
        sb1.reverse(); 
        System.out.println("want1 : "+sb1.toString());
        sb.replace(fi+1,pos,sb1.toString());    
        sb.deleteCharAt(fi);
        sb.deleteCharAt(pos-1);
        s= sb.toString();
        pos = pos-2;
       }
     }
    System.out.print(sb.toString());
  }
}