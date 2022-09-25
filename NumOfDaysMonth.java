import java.util.Scanner;


public class NumOfDaysMonth {
	
	static int year;
	static int month;

	public static void main(String[] args) {
		
		String[] months1 =  {"april", "june","september","november"};
		String[] months2 = {"jan","march","may","july","august","october","december"};
		String[] month3 = {"feb"};
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year : ");
		year = sc.nextInt();
		
		System.out.println("Enter a  month : ");
		month = sc.nextInt();
		
		
		if(month == 2) {
			System.out.println(month3[0]+" have 29 days");
		}for (String months2 : )
		}
		
	}

}
