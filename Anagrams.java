import java.util.*;

 /* This program is used to find whether the given two strings are anagrams or not */
 class Anagrams
  {
   boolean compare(String string1,String string2)
    {
     //if the length of the two strings are not equal then they    are not anagrams.

     if( string1.length() != string2.length())
       return false;

       int temp;

   Map <Character,Integer>m1 = new HashMap<Character,Integer>();
   Map <Character,Integer>m2 = new HashMap<Character,Integer>();
      
     //frequency of each character in string1 is stored map m1.
     for(char c : string1.toCharArray())
      {
//to make all upper case Character converted to lower case Characters.
       c = Character.toLowerCase(c);
       if(!m1.containsKey(c))
         m1.put(c,1);
       else
         {
          temp = m1.get(c);
          m1.put(c,++temp);
         }
       }
   // frequency of each character in string2 is store in map m2.
      for(char c : string2.toCharArray())
      {
       c= Character.toLowerCase(c);
       if(!m2.containsKey(c))
         m2.put(c,1);
       else
         {
          temp=m2.get(c);
          m2.put(c,++temp);
         }
      }
      
   // if two maps are equal then the given strings are anagrams.
      if(m1.equals(m2))
       return true;

      return false;
     }
   }

    class Solution
     {
      public static void main(String ar[])
       { 
         boolean b;
        Scanner sc = new Scanner(System.in);
         System.out.println("enter String 1");
         String s1 = sc.next();
         System.out.println("enter String 2");
         String s2 = sc.next();
         Anagrams anagrams = new Anagrams();
         b=anagrams.compare(s1,s2);
         if(b)
          System.out.println("Given Strings are Anagrams");
         else
          System.out.println("Given String are not Anagrams");
       }
     }
