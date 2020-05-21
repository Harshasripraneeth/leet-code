import java.util.*;
class CoinChange
 {
  private int coins[];
  private int money;
  private int len;
  private int dt[][];
  public CoinChange(int []coins,int money)
   {
    this.coins = coins;
    this.money = money;
    len = coins.length;
    dt = new int[len+1][money+1];
   }
  void calculate()
   {
    for(int row=0;row<=len;row++)
      dt[row][0] = 1;
    for(int col =0;col<=money;col++)
     dt[0][col] = 0;

    for(int row=1;row<=len;row++)
     {
      for(int col=1;col <= money;col++)
       {
        if( coins[row-1] <= col)
      dt[row][col] = dt[row-1][col] + dt[row][col-coins[row-1]];
        else
        dt[row][col] = dt[row-1][col];
       }
     }
 System.out.println("the number of unique ways to select coins are: "+dt[len][money]); 
 for(int row =0;row <=len;row++)
  {
   for(int col =0; col <= money;col++)
   System.out.print(dt[row][col]+" ");
   System.out.println("");
  }
   }
 }
 class Solution
  {
   public static void main(String ar[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number of coins");
     int n = sc.nextInt();
     System.out.println("enter the coins ");
     int coins[] = new int[n];
     for(int i=0;i<n;i++)
      coins[i] = sc.nextInt();
     System.out.println("enter the money");
     int money = sc.nextInt();
     CoinChange coinChange = new CoinChange(coins,money);
     coinChange.calculate();
    }
  }
