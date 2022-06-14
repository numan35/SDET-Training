package training1;

public class strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice="Ring";
		bookTitle="The Lord of The Ring";

		if(bookTitle.contains(wordChoice)) {
			System.out.println("The book contains "+wordChoice);
		}
		
		String browser="Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.out.println("The browser is chrome");
		}
		
		String firstName="Tim";
		String lastName="Short";
		String SSN="12345678";
		
		//Print initials and last 4 digits of SSN in one line
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0, 3));
		System.out.print(SSN.substring(4));
		
	}

}
