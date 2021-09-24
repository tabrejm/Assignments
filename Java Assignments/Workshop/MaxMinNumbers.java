package day2;

import java.util.Arrays;

public class MaxMinNumbers {

	public static void main(String[] args) {
				 int arr[]= {1,2,12,32,42,55,10,5};
				 for(int i=0;i<arr.length;i++)
				 {
					  for(int j=i+1;j<arr.length;j++)
					  {
						  if(arr[i]>arr[j])
						  {
							  int temp=arr[i];
							  arr[i]=arr[j];
							  arr[j]=temp;
						  }
					  }
				 }
				 int min[]=new int[3];
				 int max[]=new int[3];
				 for(int k=0,n=arr.length-1;k<3;k++,n--)
				 {
					 min[k]=arr[k];
					 max[k]=arr[n];
				 }
				 
				 System.out.println("3 Minimum numbers in array : "+Arrays.toString(min));
				 System.out.println("3 Maximum numbers in array : "+Arrays.toString(max));
			}

}
