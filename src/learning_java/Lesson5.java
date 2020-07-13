package learning_java;

public class Lesson5 {
	public static void main(String[] args) {
		int first = 2;  // variable of whole number type is assigned value 2
		int second = 4; // variable of whole number type is assigned the value 4
		int sum = first + second; //variable of whole number type is assigned the value of first + second (which means 2 + 4)
		System.out.println(sum) ; // the value of the sum of variables is printed
		
		int calcWithParens = (1+1);
		calcWithParens = calcWithParens + 3 * (2 + 5); // 23
		
		int calcWithoutParens = (1 + 1);
		calcWithoutParens = calcWithoutParens + 3 * 2;
		calcWithoutParens = calcWithoutParens + 5;
		System.out.println(calcWithParens);
		System.out.println(calcWithoutParens);
	
	}

}
