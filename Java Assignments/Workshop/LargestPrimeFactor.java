package day2;
import java.util.Scanner;
public class LargestPrimeFactor {

	public static void main(String[] args) {
		  System.out.println("Enter the number");
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int max=0;
		  boolean flag=false;
		  for(int i=2;i<n;i++)
		  {
			  if(n%i==0)
			  {
				  for(int j=2;j<i;j++)
				  {
					  if(i%j==0)
					  {
						  flag=true;
						  break;
					  }
				  }  
					  if(!flag || i==2)
					  {
						  if(i>max)
						  {
						  max=i;
						  }
					  }
					  flag=false;	  
			  }
		  }
		  System.out.println("Largest prime factor of "+n+" = "+max);
		  
	}

}
