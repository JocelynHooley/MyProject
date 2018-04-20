import java.util.Scanner;

public class PoundsToDollars {

	public static void main(String[] args) {
		
		double dollars = 0.50;
		
		System.out.println("Please enter amount in pounds:");
		Scanner sc = new Scanner(System.in);
		double pounds = sc.nextDouble();
		
		System.out.println("£" + String.format("%.2f", pounds) + " are $" 
							+ String.format("%.2f", (pounds * dollars)));
		

	}

}
