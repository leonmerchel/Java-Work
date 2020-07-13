package learning_java;
import java.util.Scanner;
public class Lesson_13 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String who = "Matt";
		String greetings= "Alabama";
		greet (who, greetings);
		greet (who, greetings + " from Nevada");
	}
	public static void greet (String name, String greetingsFrom) {
		System.out.println("Hi " + name + ", greetings from " + greetingsFrom);
	}
}