package training1;

public class weather {

	public static void main(String[] args) {
		// this app will give suggestions of what to wear based on the temp
		
		int temperature=55;
		String sunCondition="Sunny";
		
		
		if (temperature> 80)
		{
			
			System.out.println("It's pleasent. Wear a t-shirt");
			
		}
		else if((temperature>60)&&(sunCondition !="Sunny"))
		{
			System.out.println("It is a little cooler. Perhaps wear a long sleeve.");
		}
		
		else if ((temperature>50)||(sunCondition=="Overcast"))
		{
			System.out.println("This is a cool day, make sure to wear warmer clothes");
		}
		else
		{
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
		
		System.out.println("The program is ending.");
	}

}
