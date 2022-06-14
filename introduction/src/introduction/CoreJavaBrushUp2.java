

//CONDITIONAL STATEMENTS

package introduction;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr2= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr2.length; i++)
		
		{
			if(arr2[i] % 2==0)
			{
				System.out.println(arr2[i]);
				
			}
			else
			{
				System.out.println(arr2[i]+" is not an even number");
				break;
			}
			
			
			
		}
		
		
		
		ArrayList a=new ArrayList();
		a.add("nutella");
		a.add("cake");
		a.add("twix");
		a.add("salt n pepper");
		
		a.remove(2);
		
		
		System.out.println(a.get(2));
		
		
		
		
		
	}

}
