package day2;

public class Account {
	
	private double balance;

	public Account(double balance) {
		
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String Deposit(double amount)
	{
		this.balance=this.balance+amount;
		return "Money deposited successfully";
	}
	
	public String Withdraw(double withdrawAmount)
	{
		if(withdrawAmount<this.balance)
		{
		this.balance=this.balance-withdrawAmount;
		 return "Money withdrawn successfuly ";
		}
	  return "Insuffiecient balance in account";	
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	
	

}
