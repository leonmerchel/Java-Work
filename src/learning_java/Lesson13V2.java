package learning_java;

public class Lesson13V2 {
	public static void main(String[] args) {
		greetManytimes("Anthony", 3);
	 System.out.println("and");
	 greetManytimes("Martin", 2);
		
	}
	public static void greet (String name) {
		System.out.println("Hi " + name + ", greetings from the world of methods!");
	}
	
	public static void greetManytimes(String name, int times) {
		int i = 0;
		while ( i < times) {
			greet(name);
			i++;
		}
	}
}
