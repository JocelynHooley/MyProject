import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		int year = 2020;
		
		System.out.println("Enter your birth year");
		Scanner sc = new Scanner(System.in);
		int birthYear = sc.nextInt();
		System.out.println("You are born in " + birthYear + ".\n"
				+ "In the year " + year + ", you will be "
				+ (year - birthYear) + " years old.");

	}

}
