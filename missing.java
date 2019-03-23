import java.util.*;
class missing
{
int size;
missing(int n)
{
size=n;
}
int []elements= new int[size]; 
void values()
{
int ele;
int j=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the elements");
for(int i=0;i<size;i++)
{
ele=sc.nextInt();
if(ele>=0)
{elements[j]=ele;j++;}
}
sort(j+1);
}
void sort(int x)
{
int temp;
for(int i=0;i<size;i++)
{
for(int j=i;j<size-i-1;j++)
{
if(elements[i]>elements[j])
{
temp=elements[i];
elements[i]=elements[j];
elements[j]=temp;
}}
if(elements[i]!=i)
{
System.out.println("first missing positive integer is " + i);
break;}
}}
}
class ex
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int size;
System.out.println("Enter the size");
size=sc.nextInt();
missing Y = new missing(size);
Y.values();
}}