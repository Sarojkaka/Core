import java.util.Scanner;

public class ArmstrongNumber {  

	static int number;
	static int temp;
	static int total = 0;
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		

        number = num;
        while (number != 0)
        {
            temp = number % 10;     //(reminder will be 3)
            total = total + temp*temp*temp; //(3*3*3)
            number /= 10; //15
        }

        if(total == num)
            System.out.println(num + " is Armstrong number");
        else
            System.out.println(num + " is Not Armstrong number");
    }
}