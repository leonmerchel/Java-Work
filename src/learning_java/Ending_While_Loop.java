package learning_java;
import java.util.Scanner;

public class Ending_While_Loop {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type your age ");
		int age;
		while (true) {
			age = Integer.parseInt(reader.nextLine());
			if (age >= 5 && age <= 85 ) {
				break;
			}
			System.out.println("You are lying!");
			if (age < 5 ) {
				System.out.println("You are so young that you cannot know how to write!");
			} else if ( age > 85) {
				System.out.println("You are so old that you don't know how to use a computer!");
			}
			System.out.println("Type your age again: ");
		}
		System.out.println("Your age is " + age );
	}
}
