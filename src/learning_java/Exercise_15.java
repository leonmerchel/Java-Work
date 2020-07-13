package learning_java;
import java.util.Scanner;

public class Exercise_15 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How old are you?");
		int a = Integer.parseInt(reader.nextLine());
		
		if (a < 18) {
			if ( a <= 0) {
				System.out.println("You have not been born yet.");
			}else {
				System.out.println("You have not reached age of majority yet.");
			}
			
		}
		else if ( a >= 18) {
			System.out.println("You have reached age of majority already.");
		}
		
	}

}
