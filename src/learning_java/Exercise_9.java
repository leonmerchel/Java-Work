package learning_java;
import java.util.Scanner;

public class Exercise_9 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Make you own math problem!");
		System.out.println("");
		System.out.println("How many apples does Bob have? ");
		double number1 = Integer.parseInt(reader.nextLine());
		System.out.println("How many groups does he want to seperate them into? ");
		double number = Integer.parseInt(reader.nextLine());
		double yeet = number1 / number;
		System.out.println("How many apples are in each group? SIKE the answer is " + yeet);
		
	}

}
