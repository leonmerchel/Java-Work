package learning_java;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Print a number: ");
		String number = reader.nextLine();
		System.out.println("sum: " + SumFunction(number));
	}

	public static int SumFunction(String num) {
		int sum = 0;
		int i = 0;
		char o;
		while (i < num.length()) {
			o = num.charAt(i);
			String subString = num.substring(i, (i + 1));
			System.out.println("so far sum:" + sum + " adding:" + o + "    " + subString);
			
			
			sum += Integer.valueOf(subString);
			
			i++;
		}
		return sum;
	}
}
 