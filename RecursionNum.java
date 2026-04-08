public class RecursionNum
{
public static void num(int n)
{
if(n==0)
{
return ;
}
num(n-1); 
System.out.print(n+" ");
}
public static void main(String args[])
{
int n=5;
num(n);
}
}