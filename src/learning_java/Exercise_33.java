package learning_java;

import java.util.Scanner;

public class Exercise_33 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Give me the first number: ");
		int a  = Integer.parseInt(reader.nextLine());
		System.out.print("Give me the last number: ");
		int b = Integer.parseInt(reader.nextLine());
		int c = 0;
		while (a <= b) {
			c += a;
			a++;
		}
		System.out.print("The answer is: " + c );
	

	}
}
