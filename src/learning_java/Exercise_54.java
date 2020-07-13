package learning_java;
import java.util.Scanner;

public class Exercise_54 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a word") ;
		String word = reader.nextLine();
		System.out.println("How many end numbers would you like?");
		int b  = Integer.parseInt(reader.nextLine());
		int len = word.length();
		int a = len - b;
		System.out.println("The last " + b + " letters of " + word + " are: " + word.substring(a,len));
		
		
	}
}