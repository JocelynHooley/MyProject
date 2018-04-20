import java.util.Scanner;
import java.util.Arrays;

public class Calculator {

    public static void main(String[] args) {

//Give instructions to user

        System.out.println("Please enter a calculation between two numbers (e.g. 3 * 5)");

//Accept input

        Scanner sc = new Scanner(System.in);
        String calculation = sc.nextLine();

//Expression Evaluator

        int result = 0;
        char operator;

        String values[] = calculation.split("[-+*/]");

        int plusOperator = calculation.indexOf('+');
        int minusOperator = calculation.indexOf('-');
        int timesOperator = calculation.indexOf('*');
        int devideOperator = calculation.indexOf('/');

        if (plusOperator > -1) {
            operator = '+';
        } else if (minusOperator > -1) {
            operator = '-';
        } else if (timesOperator > -1) {
            operator = '*';
        } else if (devideOperator > -1) {
            operator = '/';
        } else {
            operator = '=';
        }

//Calculation

        String error = "None";

        if (operator == '+') {
            result = Integer.parseInt(values[0]) + Integer.parseInt(values[1]);
        } else if (operator == '-') {
            result = Integer.parseInt(values[0]) - Integer.parseInt(values[1]);
        } else if (operator == '*') {
            result = Integer.parseInt(values[0]) * Integer.parseInt(values[1]);
        } else if (operator == '/') {
            result = Integer.parseInt(values[0]) / Integer.parseInt(values[1]);
        } else {

            error = "Something has gone terribly, terribly wrong";
        }

//Print the results

        if (error.equals("None")) {
            System.out.println("Your answer is: " + result);

        } else {
            System.out.println(error);
        }

    }
}