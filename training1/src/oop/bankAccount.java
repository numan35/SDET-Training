package oop;

public class bankAccount implements IRate {
	
	// Define variables
	
	// Instance variables
	String accountNumber;
	private static final String routingNumber = "64839874";
	private String name;
	private String ssn;
	String accountType;
	double balance=0;
	
	public void setName(String name) {
		this.name="Mr. "+name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// Constructors
	bankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	// Overloading the same method name with different args
	bankAccount(String accountType){
		System.out.println("NEW ACCOUNT "+ accountType);
	}
	bankAccount(String accountType, double initDeposit){
		// Msg, initDeposit, accountType are all local variables
		System.out.println("NEW ACCOUNT "+ accountType);
		System.out.println("INITIAL DEPOSIT OF:$"+ initDeposit);
		String Msg=null;
		if(initDeposit<1000) {
			Msg="ERROR: Minimum deposit must be at least $1,000";
			System.out.println(Msg);
		}else {
			Msg="Thanks for our initial deposit of $" + initDeposit;
		}
		System.out.println(Msg);
		balance=balance+initDeposit;
	}
	
	
	
	
	
	// Define methods
	void deposit(double amount) {
		balance=balance+amount;
		showActivity("DEPOSIT");
	}
	void withdraw(double amount) {
		balance=balance+amount;
		showActivity("DEPOSIT");
	}
	void checkBalance() {
		System.out.println("Balance: "+ balance);
	}
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME" + name + ". ACCOUNT# " + accountNumber + ". ROUTING#"+ routingNumber+". BALANCE: $" + balance +" ]"; 
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: "+ activity);
		System.out.println("YOUR NEW BALANCE IS:$"+ balance);
	}

	//Interface methods
	
	@Override
	public void setRate() {
		System.out.println("SETTING RATE");
	}

	@Override
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
		
	}
	
























