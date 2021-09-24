package com.cybage.examples;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[2][3];
		System.out.println("Enter values");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();	
			}
		}
		for(int[] a:arr)
		{
			for(int b:a)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}

}
