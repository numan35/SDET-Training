package oop;

public class bankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		bankAccount acct1=new bankAccount();
		acct1.accountNumber="87638756568";
		acct1.setName("Roger Hue");
		System.out.println(acct1.getName());
		acct1.setSsn("6387647934");
		acct1.getSsn();
		acct1.balance=10000;
		
		acct1.deposit(1500);
		acct1.deposit(1500);
		acct1.deposit(1500);
		acct1.withdraw(2000);
		
		
		/*
		bankAccount acct2=new bankAccount("Checking Account");
		acct2.accountNumber="2344556568";
		
		bankAccount acct3=new bankAccount("Savings Account", 5000);
		acct3.accountNumber="8758763458";
		acct3.checkBalance();
		
		
		
		//Demo for the inheritance
		
		CDAccount cd1=new CDAccount();
		
		cd1.balance=3000;
		cd1.name="Juan";
		cd1.accountType="CD Account";
		System.out.println(cd1.toString());
		cd1.compund();
		*/
	
	}

}
