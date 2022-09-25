import java.util.Scanner;


public class MonthsDaysCount {
	

	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		int a = 30;
		String[] months1 =  {"april", "june","september","november"};
		
		int b = 31;
		String[] months2 = {"jab","march","may","july","august","october","december"};
		
		int c = 28;
		String [] month3 = {"feb"};
		
		
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Month : ");
		String month = sc.nextLine();
		
		//comparing user input value with assign value
		
		if(a == 4) {
			System.out.println("Total Days : "+a+""+months1[a]);
		}
	}

}
