package learning_java;
import java.util.Scanner;

public class Exercise_30 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int number = 1;
		System.out.print("I will print some numbers, where do you want me to stop? ");
		int a = Integer.parseInt(reader.nextLine());
		while ( number < a + 1) {
			System.out.println(number);
			number++;
		}
	}
}
