package learning_java;
import java.util.Scanner;

public class Exercise_14 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type in a number :");
		int a = Integer.parseInt(reader.nextLine());
		
		if (a < 0) {
			System.out.println("Your number is not positive");
		}
		else if (a > 0) {
			System.out.println("Your number is positive");
			}
		else {
			System.out.println ("Your number isnt positive or negative");
		}
		}
	}
