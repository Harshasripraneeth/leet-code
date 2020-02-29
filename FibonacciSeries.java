import java.util.*;
class FibonacciSeries
 {
  HashMap <Integer,Integer>map;
  FibonacciSeries()
   {
  
   map = new HashMap<>();
   map.put(0,0);
   map.put(1,1);
   }

   // to calculate the series upto the required position.
  public int getFibonacciSeries(int n)
    {
     if(map.containsKey(n))
      return map.get(n);
      
     map.put(n-1,getFibonacciSeries(n-1));
     map.put(n-2,getFibonacciSeries(n-2));
      
     int calculateNumber = map.get(n-1) + map.get(n-2);
     map.put(n,calculateNumber);
      return calculateNumber;
    }
   // to print the Series.
  public void printSeries(int n)
   {
    if(map.containsKey(n))
     {
      for(int i : map.keySet())
       System.out.print(map.get(i)+" ");

     }
   }
  }
  class Solution
   {
    public static void main(String a[])
     {
      Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();

      FibonacciSeries fib = new FibonacciSeries();
       System.out.println(fib.getFibonacciSeries(n-1));
       fib.printSeries(n-1);
      }
    }