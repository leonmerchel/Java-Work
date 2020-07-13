package learning_java;

import java.util.Scanner;

public class Exercise_50 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Como se llama?");
		String name = reader.nextLine();

		int len = name.length();
		if (len > 3) {
			char a = name.charAt(0);
			char b = name.charAt(1);
			char c = name.charAt(2);
			System.out.println("The first letter of your name is " + a);
			System.out.println("The second letter of your name is " + b);
			System.out.println("The third letter of your name is " + c);
		} else {
			System.out.println("you entered a name too short");
		}
	}
}
