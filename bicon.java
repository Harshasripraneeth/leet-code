import java,util.Scanner;
class bicon
{
public static void main(String ar[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();
int res=0,rem;
while(n>0)
{
rem = n%2;
if(rem=0)
res=res*10;
else
res=res+rem*10;
n=n/2;
}
System.out.println("binary number is "+res);
}
}