package learning_java;
import java.util.Scanner;

public class Exercise_12 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type in your name:");
		String a = reader.nextLine();
		System.out.println("Type in your age");
		int b = Integer.parseInt(reader.nextLine());
		System.out.println("");
		System.out.println("What is your friends name?");
		String c = reader.nextLine();
		System.out.println("How old are they?");
		int d = Integer.parseInt(reader.nextLine());
		System.out.println("");
		int abc = b + d;
		System.out.println(a + " and " + c + " are " + abc + " old in total " );
	}
	
}
	