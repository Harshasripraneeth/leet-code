import java.util.Scanner;

  class ValidNumber
   {
    public static void main(String ar[])
     {
      Scanner sc= new Scanner(System.in);
      String s;
      int eflag=0;
     /* eflag indicates the occurence of 'e' and pointflag indicates occurence of point('.')
        if eflag = 0 'e' didn't occured before
        if eflag = 1 'e' occured before
        */
      boolean pointflag=true,res=true;
      System.out.println("enter the string");
      s= sc.nextLine();
      for(int i=0; i< s.length();i++)
       {
        if(s.charAt(i) == '.')
         {
          if(eflag == 1)
           {
            res=false;
            break;
           }
           else if(pointflag)
           pointflag=false;
          else
         {
          res=false;
          break;
         }
       } 
     else if(s.charAt(i)=='e')
      {
       if(i!=s.length()-1 && eflag ==0)
       eflag=1;
       else
        {
         res=false;
         break;
        }
      }
     else if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' )
      {
     if(i!=s.length()-1)
       {
        if(s.charAt(i+1) == '+' || s.charAt(i+1) == '-' || s.charAt(i+1) == '*' || s.charAt(i+1) == '/' )
          {
           res=false;
           break;
          }
       } 
      }
 else if(Character.isAlphabetic(s.charAt(i)) && s.charAt(i)!='e')
   {
   res=false;
   break;
   }
}
   if(res)
      System.out.println("valid number");
   else 
      System.out.println("invalid number");
   }
 }







