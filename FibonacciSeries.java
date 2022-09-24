import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//assign value of a, b, c
		int num,a=0,b=1,c;
		
		//user input
		System.out.println("Enter num : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		//using for loop
		for(int i=1; i<=num; i++) 
		{
			//displaying result 
			System.out.println(a);
			c=a+b; //c=a+b > c=0+1 
			a=b;
			b=c;
		}
	}

}
