import java.util.Scanner;
class reverse
{
public static void main(String ar[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the number");
int n= sc.nextInt();
int rem,rev=0;
while(n!=0)
{
rem = n%10;
rev = rev*10+rem;
n= n/10;
}
System.out.println("the reverse of given number is : "+rev);
}
}