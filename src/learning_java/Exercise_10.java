package learning_java;
import java.util.Scanner;

public class Exercise_10 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type in a radius");
		double number1 = Integer.parseInt(reader.nextLine());
		double yeet = number1 * 2 * Math.PI;
		System.out.println("The circumfrance of your circle is " + yeet);
				
	}

}
