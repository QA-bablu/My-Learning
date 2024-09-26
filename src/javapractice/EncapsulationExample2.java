package javapractice;

public class EncapsulationExample2 {

	// Assuming we have a simple Bank Account with functions for Depositing,
	// Withdrawing and Checking Balance. Write a java code for handling the same

	private double balance;
	private double deposite;
	private double withdraw;
	
	public double getBalance()
	{
		return balance;
	}
	
	
	public double getDeposite()
	{
		return deposite;
	}
	public double getWithdraw()
	{
		return withdraw;
	}
	
	public void setBalance(double bal)
	{
		balance = bal;
	}
	
	public void setDeposite(double dep)
	{
		deposite = dep;
		balance +=dep;
	}
	
	public void setWithdraw(double with)
	{
		withdraw = with;
		balance -= with;
	}
}

