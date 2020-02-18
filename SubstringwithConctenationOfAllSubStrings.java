 import java.util.Scanner;

/*To acheive the solution I used the permutations for the arrangements of the string then concatenated the strings and found the index of the string.*/
 class Permutations
 {
  String mainstring;
   Permutations(String mainstring)
    {
     this.mainstring = mainstring;
    } 
    void permute(String[] str,int l,int r)
     {
      if(l==r)
       compare(str);
      else
       {
        for(int i =l;i<=r;i++)
         {
          str=swap(str,l,i);
          permute(str,l+1,r);
          str=swap(str,l,i);
         }
       }
     }
   String[] swap(String []a,int i,int j)
    {
     String temp;
     temp = a[i];
     a[i]=a[j];
     a[j]=temp;
     return a;
    }
   void compare(String []str)
    {
     String temp="";
     for( String s: str)
      {
       temp = temp+s;
      }
     int pos=-1;
     do
      {
       pos=mainstring.indexOf(temp,pos+1);
       if(pos!=-1)
       System.out.println(pos+" "+temp);
      }while(pos!=-1);
    }
   }
  class Solution
   {
    public static void main(String ar[])
     {
      Scanner sc = new Scanner(System.in);
     System.out.println("enter the number of Strings to enter");
     int n = sc.nextInt();
     String []strings = new String[n];
     System.out.println("enter the substrings");
     for(int i=0;i<n;i++)
      {
       strings[i]= sc.next();
      }
     System.out.println("enter the main string");
     String mainstring = sc.next();
     Permutations p = new Permutations(mainstring);
     p.permute(strings,0,n-1);
     }
    }