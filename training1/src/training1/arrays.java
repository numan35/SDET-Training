package training1;

public class arrays {

	public static void main(String[] args) {
		// Declare and define an array
		
		String[] cities= {"New York", "Atlanta", "Miami", "Houstan", "San Francisco"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println(cities[4]);
		
		
		//Declare array
		
		String[] countries;
		
		//Define array
		
		countries= new String[3];
		countries[0]="US";
		countries[1]="Canada";
		countries[2]="UK";
		System.out.println(countries[0]);

		//Declare and define the array(only size)
		
				String[] states=new String[5];
				states[0]="New York";
				states[1]="Georgia";
				states[2]="Florida";
				states[3]="Texas";
				states[4]="California";
				System.out.println(states[3]);
				
		for(int i=0; i<5; i++) {
			
			System.out.println(states[i]);
		}
		
	}

}
