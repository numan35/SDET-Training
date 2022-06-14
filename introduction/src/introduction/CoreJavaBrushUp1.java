package introduction;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int myNum=5;
		
		String website= "Rahul Shetty Academy";
		
		char letter='r';
		
		double dec=5.99;
		
		boolean myCard=true;
		
		System.out.println(myNum +" is the value srtored in the myNum variable");
		
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		System.out.println(arr[1]);
		
		
		int[] arr2= {1,2,3,4,5};
		
		
		//System.out.println(arr[3]);
		
		//for(int i=0; i<arr.length; i++)
			
		//{
		 
		//	System.out.println(arr[i]);

		//}	
		
		
		//for(int i=0; i<arr2.length; i++)
		
		//{
			
			//System.out.println(arr2[i]);
		//}
		
		String[] loveWords= {"I", "love","you","my","bulbul","beautiful wife", "Dalya"};
		
		//for(int i=0; i<5; i++)
		//{
			//System.out.println(loveWords[i]);
			
		//}
		
		for(String s:loveWords)
		{
			System.out.println(s);
		}
			
		
			
	}

}
