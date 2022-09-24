import java.util.Scanner;

public class GradeCount {
	
	static int score;
	static String grade;

	public static void main(String[] args) {
		grade = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Percentage: ");
		score = sc.nextInt();
		  switch(score/10) 
	      {
	        case 10:
	        case 9:
	           grade = "A";
	           break;
	        case 8:
	           grade = "B";
	           break;
	        case 7:
	           grade = "C";
	           break;
	        case 6:
	           grade = "D";
	           break;
	        case 5:
	           grade = "E";
	           break;
	        default:
	           grade = "F";
	           break;
	      }
	      
	      // displaying result...
	      System.out.println("Your Grade is  = " + grade);
	   }
	 
	}