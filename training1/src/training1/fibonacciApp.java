package training1;

public class fibonacciApp {

	public static void main(String[] args) {
		// fibonacci number is defined by the sum of the 2 previous fibonacci numbers
		
		System.out.println(fib(10));
		
	}
	
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		return((fib(n-1))+(fib(n-2)));
	}

}
