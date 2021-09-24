package day2;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPairSum {
	
    public int[] sumsToTarget(int[] arr, int t)
    {
    	int pair[]=new int[2];
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				int sum=arr[i]+arr[j];
				 if(sum==t)
				  {
					 pair[0]=arr[i];
					 pair[1]=arr[j];
					  return pair;
				  }
			}
		}
		
		return null;
    }

	public static void main(String[] args) {
		
		 System.out.println("Enter number");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
		 int arr[]= {1,2,4,5};
		 CheckPairSum c=new CheckPairSum();
		 if(c.sumsToTarget(arr,n)!=null)
		 {
			 System.out.println("Pair sum of "+Arrays.toString(c.sumsToTarget(arr,n)) +" in array is equal to the given number");
		 }
		 else
			 System.out.println("None of the pair sum in array is equal to the given number");	 
		
	}

}
