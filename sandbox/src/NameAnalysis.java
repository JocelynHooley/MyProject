import java.util.Scanner;

public class NameAnalysis {

	public static void main(String[] args) {
		
		//Input of First Name
		
		System.out.println("Please enter your first name:");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		
		//Input of Surname
		
		System.out.println("Please enter your surname:");
		String surname = sc.nextLine();
		
		//Initials
		
		System.out.println(
				"Your initials are " +
				firstName.charAt(0) +
				surname.charAt(0));
		
		//First Name length
		
		System.out.println(
				"First Name length is " +
				firstName.length() +
				" letters");
		
		//Last Name length
		
		System.out.println(
				"Surname length is " +
				surname.length() +
				" letters");
		
		//First Name starts with
		
		System.out.println(
				"First Name start with " +
				firstName.charAt(0));
		
		//First Name ends with
		
		System.out.println(
				"First Name end with " +
				String.valueOf(firstName.charAt(firstName.length()-1)).toUpperCase());
		
		//Surname starts with
		
		System.out.println(
				"Surname start with " +
				surname.charAt(0));
		
		//Surname ends with
		
		System.out.println(
				"Surname end with " +
				String.valueOf(surname.charAt(surname.length()-1)).toUpperCase());
		
		//First Name indexes
		
		System.out.println(
				"First Name indexes are " +
				firstName.indexOf(firstName.charAt(0)) +
				" - " +
				firstName.indexOf(firstName.charAt(firstName.length()-1)));
		
		//Surname indexes
		
		System.out.println(
				"Surname indexes are " +
				surname.indexOf(surname.charAt(0)) +
				" - " +
				surname.indexOf(surname.charAt(surname.length()-1)));
			

	}

}
