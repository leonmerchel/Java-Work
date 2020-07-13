package learning_java;
import java.util.Scanner;

public class Exercise_11A {
	

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type in a number: ");
		int numberOne = Integer.parseInt(reader.nextLine());
		System.out.println("Type in another number :");
		int numberTwo = Integer.parseInt(reader.nextLine());
		System.out.print("The greater number of the two numbers given was : ");
		System.out.println( Math.max(numberOne, numberTwo) );

		
		
	}
}
