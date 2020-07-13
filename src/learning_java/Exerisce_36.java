package learning_java;

import java.util.Scanner;

public class Exerisce_36 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean flag = true;
		int sum = 0;
		int count = 0;
		int a = 0;
		int oddnumbers = 0;
		int evenumbers= 0;
		while (flag) {
			System.out.print("Type in a number: ");
			a = Integer.parseInt(reader.nextLine());
			
		    if (( a % 2 )==0) {
				evenumbers++;
			}
			else {
			oddnumbers++;
			}
		    int  realoddnumber = oddnumbers - 1;
				
			if (a == -1) {
				System.out.println("Thank you, and see you later!");
				System.out.println("Your sum is " + sum);
		
				System.out.println("Your average was: " + ((double)sum / (double)count ));
				System.out.println("You had " + evenumbers +" even numbers.");
				System.out.println("You had " + realoddnumber + " odd numbers.");
				flag = false;
			} else {
				System.out.println();
				sum = sum + a;
				count++;
			
			}

		}

	}
}
