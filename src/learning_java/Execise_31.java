package learning_java;

import java.util.Scanner;

public class Execise_31 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("What is the first number?");
		int a = Integer.parseInt(reader.nextLine());
		System.out.print("What is the last number?");
		int b = Integer.parseInt(reader.nextLine());

		while (a <= b ) {
			System.out.println(a);
			a++;
		}
	}
}
