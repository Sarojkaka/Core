import java.util.Scanner;

public class SumofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		int sum = 0;
		while(a <= b) {
			sum+=a;
			a+=1;
			
		}
		System.out.println(sum);
	   

	}

}
