package learning_java;

import java.util.Scanner;

public class Exercise_32 {
	public static void main(String[] args) {
		int a = 0;
		Scanner reader = new Scanner(System.in);
		System.out.print("Give me a number that I can add together all of the previous numbers with: ");
		int b = Integer.parseInt(reader.nextLine());
		int c = 0;
		while (a <= b) {
			c += a;
			a++;
		}
		System.out.print("The answer is: " + c );
	

	}
}
