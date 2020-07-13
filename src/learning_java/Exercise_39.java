package learning_java;

public class Exercise_39 {
	public static void main(String[] args) {
		printStars(5);
		printStars(3);
		printStars(9);
		System.out.println("");
		printSquare(4);
		System.out.println("");
		printRectangle(5,3);
		System.out.println("");
		printTriangle(4);
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

	private static void printSquare(int sideSize) {
		int a = 0;
		while (a < sideSize) {
			printStars(sideSize);
			a++;
		}

	}

	private static void printRectangle(int width, int length) {
		int a = 0;
		int b = 0;

		while (a < length) {
			printStars(width);
			a++;
		}

	}

	private static void printTriangle(int size) {
		int a = 0;

		while (a < size) {
			printStars(a);
			a++;
		}

	}
}
