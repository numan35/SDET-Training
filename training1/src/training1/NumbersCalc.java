package training1;

public class NumbersCalc {
	
	public static void main(String[] args) {
		
		
		System.out.println("Program is starting");
		printName();
		int A= 20;
		int B=10;
		addNumber(A,B);
		multiplyNumber(A,B);
		
		
		
		
		
	}
	
	static void printName(){
		System.out.println("My name is Tom.");
	}
	
	static void addNumber(int numberA, int numberB) {
		int sum=numberA+numberB;
		System.out.println("The sum of number "+ numberA+" and "+ numberB+" is "+sum);
	}
	
	static void multiplyNumber(int numberA, int numberB) {
		
		int product=numberA*numberB;
		addNumber(product, numberB);
		System.out.println("The product of "+ numberA + " and "+ numberB +" is "+ product);
	}
}
