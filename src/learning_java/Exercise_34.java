package learning_java;
import java.util.Scanner;

public class Exercise_34 {
	public static void main(String[] args) {
		int b = 1;
		Scanner reader = new Scanner(System.in);
		System.out.print("Give me a number of which you want a factorial of: ");
		int a  = Integer.parseInt(reader.nextLine());
		while (a > 0) {
			b*= a;
			a--;
		}
		System.out.println("The factorial is: " + b);
	}
}
