package day2;

import java.util.Scanner;

public class SumofFourDigit {

	public static void main(String[] args) {
		
		   System.out.println("Enter 4 digit number");
		   Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   int sum=0;
		   while(n!=0)
		   {
			   int r=n%10;
			   sum=sum+r;
			   n=n/10;
		   }
		   
		   System.out.println(sum);

	}

}
