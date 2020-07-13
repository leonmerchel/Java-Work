
package learning_java;
import java.util.Scanner;
import java.util.Random;
public class Exericse_41 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int b = drawNumber();
		int c = 0;
		int guesses = 1;
		while (c != b) {
			System.out.println("Guess a number: ");
			int a  = Integer.parseInt(reader.nextLine());
			c += a;
			if (a < b) {
				;
				System.out.println("The number is greater. Guesses made " + guesses);
				guesses++;
			}
			else if(a > b) {
				System.out.println("The number is lesser.  Guesses made: " + guesses);
				guesses++;
			}
			else if ( a == b) {
				System.out.println("Congratulations, you got the number right! Guesses made: " + guesses);
				break;
			}
			
		}
		
	}
	private static int drawNumber() {
		return new Random().nextInt(101);
	}
}
