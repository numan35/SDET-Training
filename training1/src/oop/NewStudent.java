package oop;

public class NewStudent {
	
	private static String id="asdfgh";
	int phone;
	String city;
	String state;
	String SSN;
	
	// Methods
	
	void enroll(){
		System.out.println("Enrollment status is checking...");
	}
	
	void checkBalance(){
		System.out.println("Balance is checking...");
	}
	
	void showCourses(){
		System.out.println("Courses are being shown.");
	}
	
	void studentInfo(String getCity, String getState, int getPhone) {
		
		
		
		
	}
	
	
	
	
	
	
	//Encapsulation getters and setters
	
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	//Overriding toString()
	
	@Override
	public String toString() {
		return "Enrollment status";
	}
	
	NewStudent(String name, String SSN){
		System.out.println("New student's name is "+ " and SSN is "+ SSN);
		System.out.println("New student's email is "+ name + "@ksu.edu");
		String lastFour=SSN.substring(SSN.length()-4);
		int min=1000;
		int max=9000;
		int randomInt=(int)Math.floor(Math.random()*(max-min+1)+min);
		System.out.println("User ID is "+ id + lastFour + randomInt);
	}
}
