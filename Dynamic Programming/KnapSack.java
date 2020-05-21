import java.util.*;
 class KnapSack
  {
   int numberOfItems;
   int capacity;
   int weights[];
   int values[];
   int table[][];
   int profit;
   KnapSack(int noOfItems,int capacity,int []weights,int []values)
   {
    this.numberOfItems = noOfItems;
    this.capacity = capacity;
    this.weights = weights;
    this.values = values;
    this.table  = new int[numberOfItems+1][capacity+1];
   }
   void solve()
    {
     for(int i=1;i<=numberOfItems;i++)
      {
       for(int w=1;w<=capacity;w++)
        {
         int firstitem = table[i-1][w]; 
         int seconditem = 0;
         if( weights[i] <= w ) 
          {
           seconditem = values[i] + table[i-1][w-weights[i]]; 
          }
	   table[i][w] = Math.max(firstitem,seconditem); 
        } 
      }
    profit = table[numberOfItems][capacity];
   }
   public void showResult()
    {
     System.out.println("Total benefit: " + profit);
     for(int n=numberOfItems,w =capacity ;n>0;n--) 
      {
       if( table[n][w] != 0 && table[n][w] != table[n-1][w] ) 
        {
       	System.out.println("Item selected: "+n);
       	w = w - weights[n];
	   }
      }
    }
 }
  class Solution
   {
    public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter number of items");
         	int numOfItems = sc.nextInt();
       System.out.println("enter the capacity");
		int capacityOfKnapsack = sc.nextInt();
		int[] weights = new int[numOfItems + 1];
          System.out.println("enter the weights");
          for(int i=1;i<=numOfItems;i++)
            {
             weights[i] = sc.nextInt();
             }
           System.out.println("enter the values");
		int[] values = new int[numOfItems + 1];
		for(int i=1;i<=numOfItems;i++)
            {
             values[i] = sc.nextInt();
             }


		KnapSack knapsack = new KnapSack(numOfItems, capacityOfKnapsack, weights, values);
		knapsack.solve();
		knapsack.showResult();
	}

}
