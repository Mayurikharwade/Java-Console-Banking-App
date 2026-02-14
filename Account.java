package test;

public class Account {
    private int accNo;
    private String name;
    protected double balance;
    
    public Account(int accNo,String name,double balance) {
    	this.accNo=accNo;
    	this.name=name;
    	this.balance=balance;
    }
    
    public void deposit(double amount) {
    	balance+=amount;
    	System.out.println("Amount Deposited.....");
    }
    public void withdraw(double amount) {
    	if(amount <= balance) {
    		balance-=amount;
    		System.out.println("Amount Withdrawn");
    	}
    	else {
    		System.out.println("Insufficient Balance....");
    	}
    }
    	
    	public void showBalance() {
    		System.out.println("Balance = "+balance);
    	
    }
}
