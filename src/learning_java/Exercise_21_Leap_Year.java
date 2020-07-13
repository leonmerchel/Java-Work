package learning_java;
import java.util.Scanner;

public class Exercise_21_Leap_Year {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in a year: ");
		int a = Integer.parseInt(reader.nextLine());
		
		if (( a % 4 )==0) {
		System.out.println("The year " + a + " is a leap year.");
		}
		else if ( a < 1) {
		System.out.println("The given number is not a valid year.");
		}
		else {
		System.out.println("The year " + a + " is not a leap year");
		}
		}
		
	}


