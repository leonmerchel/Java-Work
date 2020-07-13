package learning_java;
import java.util.Scanner;

public class Even_Odd_Exercise_16 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in a number:");
		int a = Integer.parseInt(reader.nextLine());
		System.out.println("");
		if  ( a == 0) {
			System.out.println("Your number is neither odd or even.");
		} 
		else if (( a % 2 )==0) {
			System.out.println("Your number is even.");
		}
		else {
			System.out.println("Your number is odd");
		}
			
		}
	}

