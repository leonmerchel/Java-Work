package learning_java;
import java.util.Scanner;

public class Exercise_51 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = reader.nextLine();
		int a = 0;
		int number = 1;
		
		int len = name.length();
		while (a < len) {
			char b1 = name.charAt(a);
			System.out.println(number + ".  Character: " + b1);
			number++;
			a++;
		}
		
		
	}
}
