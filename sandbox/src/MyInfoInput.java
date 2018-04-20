import java.util.Scanner;

public class MyInfoInput {

	public static void main(String[] args) {
		
		System.out.println("Enter your name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter your student number:");
		String studentNumber = sc.nextLine();
		
		System.out.println("Enter your email address:");
		String emailAddress = sc.nextLine();
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(studentNumber);
		System.out.println(emailAddress);
		
		

	}

}
