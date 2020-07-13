package learning_java;

public class Lesson_14 {
	public static void main(String[] args) {
		int number = 1;
		System.out.println("Main program variable number holds value: " + number);
		addThree(number);
		System.out.println("Main program variable number holds the variable: " + number);
		
	}
	public static void addThree(int number) {
		System.out.println("Method parameter number holds the value: " + number);
		number = number + 3;
		System.out.println("Method parameter number hold sthe value: " + number) ;
	}
}
