package day2;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		  Account ac=new Account(1000);
		 
		  System.out.println("Welcome to our bank\n choose below option as per your requirement");
		  System.out.println("1.Get Account balance");
		  System.out.println("2.Deposit");
		  System.out.println("3.Withdraw");
		  System.out.println("10.Exit");
		  Scanner sc=new Scanner(System.in);
		  int option=0;
	while(option!=10)
	{
		 
		 option=sc.nextInt();
		
		  switch(option)
		  {
		  case 1:
			     System.out.println(ac.getBalance());		  
		         break;
		         
		  case 2: System.out.println("Enter the amount to deposit");
		         System.out.println(ac.Deposit(sc.nextDouble()));
		         break;
		         
		  case 3:System.out.println("Enter the amount to withdraw"); 
		         System.out.println(ac.Withdraw(sc.nextDouble()));
		         break;
		  case 10: option=10;
		         System.out.println("Exited from operations");
		         break;
		   default : System.out.println("Select valid option");      
		  
		  }
		  
	}

	}

}
