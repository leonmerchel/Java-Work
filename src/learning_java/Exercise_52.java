package learning_java;
import java.util.Scanner;

public class Exercise_52 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = reader.nextLine();
		int a = 0;
		int number = 1;
		
		int len = name.length()-1 ;
		char b1 = name.charAt(len);
		while (a < len  + 1) {
			 b1 = name.charAt(len);
			System.out.println(number + ".  Character: " + b1);
			number++;
			len--;
		}
		
		
	}
}
