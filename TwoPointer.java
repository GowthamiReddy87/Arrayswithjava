public class TwoPointer 
{
public static boolean twoP(int arr[],int target)
{
int left=0;
int right=arr.length-1;
while(left<right)
{
if(arr[left]+arr[right]==target)
{
return true;
}
else if(arr[left]+arr[right]>target)
{
right--;
}
else
{
left++;
}
}
return false;
}
public static void main(String[] args)
{
int arr[]={1,2,4,6,10};
int target=8;
System.out.println(twoP(arr,target));
}
}