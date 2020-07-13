package learning_java;

import java.util.Scanner;

public class Exercise_35 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a = 0;
		int b = 0;
	
		System.out.print("Type a number: ");
		int c = Integer.parseInt(reader.nextLine());
		while (a <= c) {
			 b += (int) Math.pow(2,a);
			a++;
			
		}
		System.out.println("The result is: " + b);
	}
}
