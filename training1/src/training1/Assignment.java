package training1;

public class Assignment {

	public static void main(String[] args) {
		// 1) Write a function that takes a value n returns the sum of numbers 1 to n
		// addUp(1)=1
		// addUp(2)=1+2=3
		// addUp(3)=1+2+3=6
		// addUp(4)=1+2+3+4=10
		
		int[] numbers= {2,6, 48,-78, 120};
		
		System.out.println(addUp(2));
		System.out.println(fac(5));
		System.out.println(ave(numbers));
		System.out.println(min(numbers));
		System.out.println(max(numbers));
	}
	
	public static int addUp(int n) {
		
		if(n==0) {
			return 0;
		}else if(n==1){
			return 1;
		}
		return(addUp(n-1)+n);
	}
	
	// 2) Factorial function
	
	
	public static int fac(int n) {
		if(n==0) {
			return 1;
		}
		return(fac(n-1)*n);
	}
	
	// 3)Write 3 functions that take an array as a parameter and return the minimum,
	// average, and maximum values of that array
	
	public static int ave(int[] arr) {
		
		int ave=0;
		
		for(int i=0; i<arr.length; i++ ) {
			ave=ave+arr[i];
		}
		return ave/arr.length;
	}
	
	
	// Write a function that returns the lowest number of an array
	
	public static int min(int[] arr) {
		
		int min=arr[0];
		for(int i=0; i<arr.length; i++) 
		{
			if(min>arr[i]) 
			{
				min=arr[i];
			}
			
		}return min;
		
	}
	
	// Write a function that returns the highest number of an array
		
	public static int max(int[] arr) {
		
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		}return max;
		
	}
	
	
	
	}
	


