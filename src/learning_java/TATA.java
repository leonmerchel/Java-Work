package learning_java;

public class TATA {
	public static void main(String[] args) {
		printTriangle(100);
	}

	private static void printStars(int amount) {
		int a = 0;
		while (a < amount) {
			System.out.print("*");
			a++;

			if (a == amount) {
				System.out.println("");
			}
		}

	}
	private static void printTriangle(int size) {
		int a = 1;	
		
		while (a < size) {
			printStars(a);
			a++;
		}
		
	}
}
