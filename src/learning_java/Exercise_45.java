package learning_java;

public class Exercise_45 {
	public static void main(String[] args) {
		int answer = most(8, 7, 3);
		System.out.println("Greatest: " + answer);
	}
	
	public static int most(int number1, int number2, int number3) {
		if (number2 > number1 && number2 > number3) {
			return number2;
		}
		
		
		else if (number1 >  number2 && number1 > number3) {
			return number1;
		}
		else if (number3 > number1 && number3 > number2) {
			return number3;
		}
		else if (number2 > number1 || number2 > number3) {
			return number2;
		}
		
		
		else if (number1 >  number2 || number1 > number3) {
			return number1;
		}
		else if (number3 > number1 || number3 > number2) {
			return number3;
		}
		return number3;
		
		
	}
	
}
