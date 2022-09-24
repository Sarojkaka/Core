import java.util.Scanner;

public class Calculator {

	static double a;
	static double b;
	static double c;

	public static void main(String[] args) {
		// user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		a = sc.nextDouble();
		System.out.println("Enter Second Number");
		b = sc.nextDouble();
		System.out.println("Enter Mathmatic Equation : Add for 1, Sub for 2 :, divide for 3 :, Multiply for 4 :");
		c = sc.nextDouble();

		// using condition to check result
		if (c == 1) {
			System.out.println("Total : " + (a + b));

		} else if (c == 2) {
			System.out.println("Total : " + (a - b));
		} else if (c == 3) {
			System.out.println("Total : " + (a / b));
		} else if (c == 4) {
			System.out.println("Total : " + (a * b));
		} else {
			System.out.println("Invalid Input");
		}
	}

}
