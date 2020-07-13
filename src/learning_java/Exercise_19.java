package learning_java;
import java.util.Scanner;

public class Exercise_19 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("How old are you? ");
		int a = Integer.parseInt(reader.nextLine());
		if ( a <= 120 && a > 0) {
		int b = 2020 - a;
		int c = b - 1;
			System.out.println("Ok, so you were born in " + b + ". " + " If your birthday did not come this year yet, then you were born in " + c);
			} else {
		System.out.println("Impossible, liar.");
			}
	}

}
