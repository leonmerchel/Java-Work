package learning_java;
import java.util.Scanner;

public class Exercise_47 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = reader.nextLine();
		System.out.println("Your name has " + name.length() + " characters.");
	}
}
