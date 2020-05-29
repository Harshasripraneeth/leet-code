
import java.util.*;
class Solution {
    public int superEggDrop(int K, int N) {
    
        int dt[][]= new int[K+1][N+1];
        
         for(int row=0;row<=K;row++)
        {
            dt[row][1] =1;
            dt[row][0] =0;
        }
            
        for(int col=1;col<=N;col++)
        {
            dt[1][col] = col;
            dt[0][col] =0;
        }
        
        for(int row=2;row <=K;row++)
        {
            for(int col=2;col <=N;col++)
            {
               dt[row][col] = Integer.MAX_VALUE;
               for(int floor =1;floor <= col;floor++)
               {
                   int cost = 1+ Math.max(dt[row-1][floor-1],dt[row][col-floor]);
                   dt[row][col] = Math.min(cost,dt[row][col]);
               }
            }
        }
        for(int i=0;i<=K;i++)
         {
          for(int j=0;j<=N;j++)
          System.out.print(dt[i][j]+" ");
          System.out.println("");
         }
        return dt[K][N];
        
    }
 public static void main(String ar[])
  {
   Solution s = new Solution();
   Scanner sc = new Scanner(System.in);
   System.out.println("enter eggs");
   int eggs = sc.nextInt();
   
   System.out.println("enter floors");
   int floors = sc.nextInt();
   s.superEggDrop(eggs,floors);
  }
}