package learning_java;

public class Lesson_4 {
	public static void main(String[] args) {
		String text = "includes text";
		int wholeNumber = 123;
		double decimalNumber = 3.141592653 ;
		boolean isTrue = true;
		
		System.out.println("The variable's type is text. Its value is " + text) ;
		System.out.println("");
		System.out.println("The variable's type is integer. Its value is " + wholeNumber) ;
		System.out.println("");
		System.out.println("The variable's type is decimal number. Its value is " + decimalNumber) ;
		System.out.println("");
		System.out.println("The variable's type is truth value. Its value is " + isTrue) ;
		System.out.println("");
		System.out.println("The variable's is integer. Its value is " + wholeNumber) ;
		System.out.println("");
		
		wholeNumber = 42;
		System.out.println("The variable's type is integer. Its value is " + wholeNumber) ;
		
		String text2 = "yabbadabbadoo!";
		text2 = "42"; // Does not work! :(
		
		double decimalNumber2 = 0.42 ;
		decimalNumber = 1; // Works! :)
		
		int pizzaSlice = 36 ;
		System.out.println("The number is " + pizzaSlice);
	}
}
