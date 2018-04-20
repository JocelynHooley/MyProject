import java.util.Scanner;

public class FitnessAge {

	public static void main(String[] args) {
		
		//Input for fitness test 1
		
		System.out.println(
				"Enter score for fitness test 1: ");
		Scanner sc = new Scanner(System.in);
		int test1 = sc.nextInt();
		
		//Input for fitness test 2
		
		System.out.println(
				"Enter score for fitness test 2: ");
		int test2 = sc.nextInt();
		
		//Fitness test scores
		
		System.out.println(
				"Score for fitness test 1: " + test1 + "\n" +
				"Score for fitness test 2: " + test2);
		
		//Average Score
		
		int average = ((test1 + test2)/2);
		
		System.out.println(
				"Your average score is: " + average);
		
		//PC fit age (average * 8)/5) + 10
		
		System.out.println(
				"Your PC Fit age is " + 
				(((average *8)/5) + 10) +
				" years old");
		
		//Input actual age
		
		//Difference between PC age and actual age

	}

}
