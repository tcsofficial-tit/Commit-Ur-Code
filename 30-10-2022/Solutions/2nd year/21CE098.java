import java.util.Scanner;
public class Solution {
    public static int[] buildArray(int[] nums) {
       int n=nums.length;
       int arr[]=new int [n];
       for(int j=0;j<n;j++)
       {
          arr[j]=nums[nums[j]];
       }
    return arr;
    }
    public static void main(String[] ars)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
	int k=s.nextInt();
        System.out.println("enter the elements of an array");
	int nums[]=new int[k];
	for(int i=0;i<k;i++)
	{
		nums[i]=s.nextInt();
	}
        int arr[]=buildArray(nums);
        for(int j=0;j<k;j++)
        {
        System.out.println(arr[j]);
        }
    }
}
