package learning_java;
import java.util.Scanner;

public class Exercise_56 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type in a word: ");
		String a = reader.nextLine();
		System.out.println("In reverse order: " + reverse(a));
		
		
	}
	
	public static String reverse(String text) {
		int count = text.length()-1;
		String returnString ="";
				
		
		while (count > - 1) {
			returnString += text.charAt(count);
			count--;
		}
		
		return returnString;
		
	}

	
}
