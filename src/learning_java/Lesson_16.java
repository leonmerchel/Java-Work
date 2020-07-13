package learning_java;
import java.util.Scanner;

public class Lesson_16 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = 1;
		int y = 2;
		
		y = 3*x;
		System.out.println("value of y now is: " + y);
		
		String word1 ="Programming";
		String word2= "Java" ;
		
		System.out.println("String " + word1 + " length: " + word1.length());
		System.out.println("String " + word2 + " length: " + word2.length());
		
	}
}
