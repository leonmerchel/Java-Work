package learning_java;
import java.util.Scanner;

public class Exercise_25 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		System.out.print("Type in a number: ");
		int a = Integer.parseInt(reader.nextLine());
		sum= sum + a;
		System.out.print("Type in another number: ");
		int b = Integer.parseInt(reader.nextLine());
		sum = sum + b;
		System.out.print("Lets run this one more time, give me a number: ");
		int c = Integer.parseInt(reader.nextLine());
		sum = sum + c;
		System.out.println("The sum of those numbers is : " + sum + ".");
	}
	
	
}
