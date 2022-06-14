package training1;

public class loops {

	public static void main(String[] args) {
		
		
		
		String[] states=new String[5];
		states[0]="New York";
		states[1]="Georgia";
		states[2]="Florida";
		states[3]="Texas";
		states[4]="California";
		
		// Do loop: enters the loop THEN tests condition
		
		int i=0;
		
		do {
			System.out.println(states[i]);
			i=i+1;
			
		}while(i<5);
		
		//While Loop: tests condition THEN enters loop
		
		System.out.println("*************");
		
		
		int n=0;
		boolean stateFound=false;
		
		while(!stateFound) {
			String state=states[n];
			System.out.println(state);
			if(state=="Texas") {
				System.out.println("STATE FOUND!");
				stateFound=true;
			}
			n++;
		}
		
		//Best loop for iterating through an array
		
		System.out.println("PRINTING WITH FOR LOOP");
		
		
		for(int x=0; x<5; x++) {
	
			System.out.println(states[x]);
		}
	}

}
