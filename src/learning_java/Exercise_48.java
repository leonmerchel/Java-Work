package learning_java;
import java.util.Scanner;

public class Exercise_48 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your name?") ;
		String name = reader.nextLine();
		char character = name.charAt(0);
		System.out.println("Your name's first letter is " + character + ".");
	}
}
