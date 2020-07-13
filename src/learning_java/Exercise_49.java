package learning_java;
import java.util.Scanner;

public class Exercise_49 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = reader.nextLine();
		int a = name.length() -1;
		int c = 0;
		while (c != a) {
			c++;
		}
		char d = name.charAt(c);
		System.out.println("The last letter of your name is " + d + ".");
		
	}
}