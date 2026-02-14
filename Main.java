package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose Account Type:");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		
		int type=sc.nextInt();
		
		Account acc;
		
		if(type==1) {
			acc=new SavingsAccount(101, "Mayuri", 5000);
		}
		else {
			acc=new CurrentAccount(102, "Mona", 5000);
		}
		
		
		
		while(true) {
			System.out.println("1.Deposit 2.Withdraw 3.check Balance 4.Exit");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter amount:");
				acc.deposit(sc.nextDouble());
				break;
				
			case 2:
				System.out.println("Enter amount");
				acc.withdraw(sc.nextDouble());
				break;
				
			case 3:
				acc.showBalance();
				break;
				
			case 4:
				System.exit(0);
			}
		}

	}

}
