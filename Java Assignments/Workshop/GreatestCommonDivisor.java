package day2;

import java.util.Scanner;

public class GreatestCommonDivisor {
	
    public int gcd(int p, int q)
    {
    	int g=0;
    	for(int i=1;i<p && i<q;i++)
    	{
    		if(p%i==0 && q%i==0)
    		{
    			g=i;
    		}
    	}
    	return g;
    	
    }

	public static void main(String[] args) {
		
		GreatestCommonDivisor d=new GreatestCommonDivisor();
		System.out.println("Enter 2 numbers to Calculate Greatest Common Divisor");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Greatest Common Divisor : "+d.gcd(n1, n2));
		
	}

}
