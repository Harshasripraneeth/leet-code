import java.util.*;
class HackMoney
{
  static int ar[] = {10,20};
public static void main(String a[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
solve(n);
}
static void solve(int n)
{
if(calculate(n))
 System.out.println("Yes");
else
System.out.println("No");
}

static boolean calculate(int n)
{
if(n==1)
  return true;
for(int i =0;i<ar.length;i++)
  {
  if(validNumber(n,i))
   {
if(calculate(n/ar[i]))
   return true;
    }
 
  }
 return false;
}
static boolean validNumber(int n,int p)
{
if((n%ar[p]) != 0 )
 return false;

return true;
}

}
