import java.util.*;
class MinimumCost
{
public static void main(String ar[])
{
List<Integer> list = new ArrayList();
Scanner sc = new Scanner(System.in);
int res =0;
int n = sc.nextInt();
int temp;
System.out.print("eneter");
for(int i=0;i<n;i++)
{
temp = sc.nextInt();
list.add(temp);
res = res+temp;
}
if(res % n !=0)
System.out.print("-1");
else
{
int count =0;
int x = res/n;
for(int i=0;i<n;i++)
{
if(list.get(i) >= x)
{
count = count+(list.get(i)-x);
}
}
System.out.print("minimum number of operations required "+count);
}
}
}

