package test;

public class CurrentAccount extends Account {
   
	double overdraft=5000;
	
	public CurrentAccount(int accNo,String name,double balance) {
		super(accNo,name,balance);
	}
	
	@Override
     public void withdraw(double amount) {
		
		if(balance + overdraft >= amount) {
			balance -= amount;
			System.out.println("Current Withdrawn: "+amount);
		}
		else {
			System.out.println("Overdraft limit exceeded!");
		}
	}
}
