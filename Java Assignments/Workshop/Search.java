package com.cybage.examples;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int[] arr= {1,5,8,4,2};
		boolean flag=false;
		System.out.println("Enter number to search");
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				System.out.println("Number found at position "+(i+1));
				flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println("Number not found");
		}

	}

}
