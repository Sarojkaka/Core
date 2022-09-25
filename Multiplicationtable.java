import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}
	public static void input() {
		Scanner sc = new  Scanner(System.in);
		int n;
		System.out.print("Enter Multiplication");
		n = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(n+ " X " +i+ "="+n*i);
		}
		System.out.print("Do you want to make another table (y/n)");
		char ch = sc.next().charAt(0);
		if(ch=='y' || ch=='Y') 
		{
			System.out.print("\u000C");
			input();
		}
		else 
		{
			System.out.print("\u000C");
			System.out.print("thank u");
			System.exit(0);
		}
	}

}
