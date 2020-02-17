import java.lang.*;
import java.util.*;
class SubPalindrome
 {
  String s;
  String result ="";
  Set <String>set;
  SubPalindrome(String s)
   {
    this.s=s;
    set = new HashSet<String>();
   }

  //checks whether the given String is palindrome or not.

  boolean palindrome(int start,int pos)
   {
    int i,j;
    boolean ret=false;//return value
   /* if ret is false then the given string is not palindrome
      if it is true then the given string is palindrome*/

    for(i=start,j=pos;i<(pos-start/2);i++,j--)
     {
      if(s.charAt(i)!=s.charAt(j))
       {
        ret=false;
        break;
       }
        else
        ret=true;
      }
      return ret;
    }
   
  
  void strings(int start,int pos)
   {
    boolean valid;
    String temp;
    int ni;//represents next index

    /* do- while loop checks the every occurence of the character present at position pos and checks whether it is palindrome or not */
    do
      {
       valid=palindrome(start,pos);
       if(valid)
        {
        temp =s.substring(start,pos+1);
        if(result.length() < temp.length())
         result=temp;
        }
       start++;
       ni=s.indexOf(s.charAt(pos),start);
       if(ni !=-1)
        palindrome(ni,pos);
       else
        break;
     } while(ni!=-1);
   }
    
   // checks the recurrence of the character
   void check()
    {
     int i=-1;
     for(char c:s.toCharArray())
      {
       i++;

/* A character is repeated check whether the string from the starting index of the character and the present position is palindrome or not*/

       if(s.indexOf(c)!=-1&& s.indexOf(c)!=i) 
       strings(s.indexOf(c),i);
       }
    }
  
   void display()
    {
       System.out.println(result);
    }
           
  }
class Palindromes
  {
   public static void main(String ar[])
    {
     String s;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter your string"); 
     s=sc.nextLine();
     SubPalindrome sb= new SubPalindrome(s);
     sb.check();
     sb.display();
    }
  }