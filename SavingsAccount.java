package test;

public class SavingsAccount extends Account {
     
	double minBalance=100;
	
	public SavingsAccount(int accNo,String name,double balance) {
		super(accNo,name,balance);
	}
	
	
	@Override
	public void withdraw(double amount) {
		
		if(balance-amount >= minBalance) {
			balance -=amount;
			System.out.println("Savings Withdrawn:"+amount);
		}
		else {
			System.out.println("Minimum balance must be maintained!");
		}
	}
}
