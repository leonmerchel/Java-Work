package learning_java;
import java.util.Scanner;

public class Exercise_26 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("Type in a number: ");
			int a = Integer.parseInt(reader.nextLine());
			if (a == 0) {
				break;
			}
			sum = sum + a;
		System.out.print("Sum now: " + sum + ". Type 0 to finish. ");	
		}
		System.out.println("Sum in the end: " + sum + ".");
	}
}
