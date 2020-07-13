package learning_java;
import java.util.Scanner;

public class Lesson_7 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// program code
		System.out.print("What is your name? ");
		String name = reader.nextLine(); //Reads a line of input from the user and assigns it to the variable called name
		System.out.println("Hi, " + name);
		System.out.print("Type an integer: ");
		int number = Integer.parseInt(reader.nextLine());
		
		System.out.println("You typed " + number);
	}

}
