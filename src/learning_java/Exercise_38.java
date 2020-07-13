package learning_java;

import java.util.Scanner;

public class Exercise_38 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int b = 0;
		System.out.println("How man times do you want me to print the sentence?");
		int a = Integer.parseInt(reader.nextLine());
		while ( b < a ) {
		printText();	
		b++;
		}
	}
public static void printText() {
	System.out.println("In the beginning there were the swamp, the hoe and Java.");
}

}
	