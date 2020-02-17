import java.util.*;
 class Solve
 {
  void solveHanoi(int n,String srod,String mrod,String lrod)
   {
    if(n==1){
    System.out.println("moving plate 1 from "+srod+"to "+lrod);
    return;
   }
  solveHanoi(n-1,srod,lrod,mrod);
  System.out.println("moving plate "+n+"from "+srod+"to "+lrod);
  solveHanoi(n-1,srod,mrod,lrod);
  }
 }
 class Hanoi
  {
   public static void main(String ar[])
    {
    int n;
    System.out.println("enter the number of disks");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
   Solve s = new Solve();
   s.solveHanoi(n,"firstrod","middlerod","lastrod");
      /*In general we use three rods to solve tower of hanoi    
      problems*/
   }
  }
