package day2;

import java.util.Arrays;

public class GreaterNumber {

	public static void main(String[] args) {
		
		int arr[]= {1,2,24,5,4,15,3,6};
		int max=arr[0];
		
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>max)
			 {
				 max=arr[i];
			 }
		 }
		 
		 System.out.println("Greater number in array : "+max);
	}
		
		 

}
