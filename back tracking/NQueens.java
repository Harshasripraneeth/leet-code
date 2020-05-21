import java.util.*;
class NQueens
 {
  int noOfQueens;
  int positions[][];
  NQueens(int n)  
   {
   this.noOfQueens = n;
   this.positions = new int[n][n];
   }
  void solve()
   {
    if(setQueens(0))
      printQueens();
    else
     System.out.println("no solution");
   }
   void printQueens()
    {
      for(int i=0;i<positions.length;i++)
        {
	    for(int j=0;j<positions.length;j++) 
           {				
            if( positions[i][j] == 1 )
              System.out.print(" * ");
		else 
		System.out.print(" - ");
		}	
	   System.out.println();
        }
    }
   boolean setQueens(int col)
    {
     if(col == noOfQueens)
      return true;

     for(int row =0;row<noOfQueens;row++)
      {
       if(validPosition(row,col))
         {
         positions[row][col] = 1;
         if(setQueens(col+1))
           return true;
         positions[row][col] = 0;
        } 
     }
     return false;
    }
  boolean validPosition(int row,int col)
   {
    for(int i=0;i<col;i++)
     {
     if(positions[row][i] == 1)
      return false;
     }
    for(int i=row,j=col; i >=0 && j>=0;i--,j--)
     {
      if(positions[i][j] == 1)
        return false;
     }
    for(int i=row,j=col; i < positions.length && j>=0;i++,j--)
     {
       if(positions[i][j] == 1)
         return false;
     }
    return true;
   }
  }
class Solution
{
  public static void main(String ar[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number of queens");
    NQueens queens = new NQueens(sc.nextInt());
     queens.solve();
   }
}

