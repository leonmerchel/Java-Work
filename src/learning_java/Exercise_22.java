package learning_java;

import java.util.Scanner;

public class Exercise_22 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean flag = true;
		while ( flag ) {
	
			System.out.print("Type in the password:");
			String a = reader.nextLine();

			if (a.equals("memesRkool")) {
				System.out.println("Right!");
				System.out.println("The seceret message is:'Look Behind You'");
				flag = false;
			} else {
				System.out.println("Wrong!");

			}
		}
	}

}
