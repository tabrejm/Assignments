package day2;

import java.util.Arrays;

public class SortArrayAscending {

	public static void main(String[] args) {
		
		int arr[]= {1,2,24,5,4,15,3,6};
		 System.out.println("Original Array : "+Arrays.toString(arr));
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
		 
		 System.out.println("Array soretd in ascending order : "+Arrays.toString(arr));

	}

}
