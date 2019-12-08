import java.util.*;
class solve
{
void solvehanoi(int n,String srod,String mrod,String lrod)
{
if(n==1){
System.out.println("moving plate 1 from "+srod+"to "+lrod);
return;
}
solvehanoi(n-1,srod,lrod,mrod);
System.out.println("moving plate "+n+"from "+srod+"to "+lrod);
solvehanoi(n-1,srod,mrod,lrod);
}
}
class hanoi
{
public static void main(String ar[])
{
int n;
System.out.println("enter the number of disks");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
solve s = new solve();
s.solvehanoi(n,"firstrod","middlerod","lastrod");
//In general we use three rods to solve tower of hanoi problems
}
}
