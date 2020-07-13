package learning_java;
import java.util.Scanner;

public class Exercise_8 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("How old are you? ");
		int number = Integer.parseInt(reader.nextLine());
		System.out.print("How young are you???????");
		int number1 = Integer.parseInt(reader.nextLine());
		int yeet =number + number1;
		System.out.println("So you are " + yeet + " years young-old");
	}
}
