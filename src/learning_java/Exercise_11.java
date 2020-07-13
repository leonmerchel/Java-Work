package learning_java;
import java.util.Scanner;

public class Exercise_11 {
	

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type in a number: ");
		int a = Integer.parseInt(reader.nextLine());
		System.out.println("Type in another number :");
		int b = Integer.parseInt(reader.nextLine());
		String yeet ="The greater number of the two numbers given was : ";
		int biggerNumber = 0;
		if (a > b) {
			biggerNumber = a;
			System.out.println( yeet + biggerNumber);
		} else if(b>a) {
			biggerNumber = b;
			System.out.println( yeet + biggerNumber);
		} else {
			System.out.println("Numbers are equal");
		}
		
		
	}
}
