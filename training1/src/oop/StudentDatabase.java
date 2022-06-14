package oop;



public class StudentDatabase {
	
	public static void main(String[] args) {

		
		NewStudent student1=new NewStudent("Ahmet", "12345678");
		
		
		student1.showCourses();
		
		student1.setCity("Atlanta");
		student1.setState("Geaorgia");
		student1.setPhone(898676443);
		
		System.out.println("Student's city is " + student1.getCity());
		System.out.println("Student's state is " + student1.getState());
		System.out.println("Stdent's phone number is " + student1.getPhone());
}


}






















