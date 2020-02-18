      import java.util.*;

      /* this program is to search the lower bound and upper bound of the number present in the array*/

// As the given array should be sorted we are going to use //binary search.
      class SearchTarget 
       {
        int search(int[] num, int target,boolean flag) 
         {
           int res=-1;
           if (num == null || num.length == 0)
             return res;
          else
           {
           int mid;
           int left = 0;
           int right = num.length - 1;
          while(left <= right)
           {
            mid = (left+right) / 2;
            if(num[mid] == target)
              {
                res = mid;
                if(flag) 
                 {
                    left = mid + 1;
                 }
                else right = mid - 1;
            }
            else if(num[mid] > target) 
               right = mid -1;
            else 
             left = mid + 1;
          }
       
        }
      return res;
     }
   }
   class Solution
     {
      public static void main(String ar[])
       {
        SearchTarget st = new SearchTarget();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements to enter");
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++)
         {
          num[i] = sc.nextInt();
         }
        System.out.println("enter the target");
         int target = sc.nextInt();
        int upper= st.search(num,target,true);
        int lower = st.search(num,target,false);
        System.out.println("lower bound is "+lower +" upper bound is "+upper);
       }
     }

 