package learning_java;

public class Lesson_8 {
	public static void main(String[] args) {
	
		int number = 55;
		if (number != 0) {
			System.out.println("the number was not equal to 0");
		}
		if (number >= 1000) {
			System.out.println("The number was greater than or equal to 1000");
		}
		int first = 1;
		int second = 3;
		boolean isLesser = first < second;
		if (isLesser) {
			System.out.println(first + " is less than " + second + "!");
			
			
			
		}
		String text = "course";
		if (text.equals("marzipan")) {
			System.out.println("The variable text contains the text marzipan");
		} else {
			System.out.println("The variable text does not contain the text marzipan ");
			
		}
		
				
	}


}
