package learning_java;
import java.util.Scanner;

public class Exercise_53 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int b = 0;
		System.out.println("Give me a word.");
		String word = reader.nextLine();
		int len = word.length();
		System.out.println("How many letters do you want to print of the word?");
		int a  = Integer.parseInt(reader.nextLine());
		System.out.println(word.substring(0,a));
		
	}
}
