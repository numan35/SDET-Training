package training1;

public class switchStatement {

	public static void main(String[] args) {
		// execute different block of a code based on the value of a condition
		
		String dayOfTheWeek="Tuesday";
		
		switch (dayOfTheWeek){
			
		case "Monday":
			System.out.println("Today is Monday");
		break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
		break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
		break;
		case "Thursday":
			System.out.println("Today is Thursday");
		break;
		case "Friday":
			System.out.println("Today is Friday");
		break;	
		}

	}

}
