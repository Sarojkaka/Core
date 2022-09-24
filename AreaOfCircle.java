import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		//Declare value of pi
		float pi = 3.14f;
		
		
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Radius : ");
		double radius = sc.nextDouble();
		
		//Displaying result of pi
		System.out.println("Area Of Radius : "+pi*radius*radius);

	}

}
