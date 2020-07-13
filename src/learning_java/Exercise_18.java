package learning_java;

import java.util.Scanner;

public class Exercise_18 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in a grade from 0 - 100: ");
		int a = Integer.parseInt(reader.nextLine());
		if ( a <= 65 && a > -1) {
			System.out.println(" The score is a fail / F.");
		} else if( a >= 90 && a < 101) {
			System.out.println(" The given grade is an A.");
		} else if ( a >= 80 && a < 90) {
			System.out.println(" The given grade is a B.");
		} else if ( a >= 70 && a < 80) {
			System.out.println(" The given grade is a C");
		} else if ( a >= 65 && a < 70 ) {
			System.out.println (" The given grade is a D");
		}
		else {
			System.out.println(" Your number is invalid. Please try again with a number from 0 - 100");
		}
		
		}
}
