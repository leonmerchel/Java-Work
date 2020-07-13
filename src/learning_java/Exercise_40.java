package learning_java;

public class Exercise_40 {
	public static void main(String[] args) {
		printTriangle(11);
		System.out.println("");
		printChristmasTree(5);
	}

	private static void printWhitespaces(int size) {
		int a = 0;
		while (a < size) {
			System.out.print(" ");
			a++;
		}

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

		int b = size - 1;

		while (a < size) {
			printWhitespaces(b);
			printStars(a);
			a++;
			b--;
		}
		if (a == size) {
			printStars(size);
		}

	}

	private static void printChristmasTree(int height) {
		int a = 1;
		int yay = 0;
		int b = height - 1;

		while (yay < height) {

			printWhitespaces(b);
			printStars(a);
			a += 2;
			yay++;
			b--;
		}
		int stem = 3;
		int stem1 = a / 2 - 2;
		printWhitespaces(stem1);
		printStars(3);
		printWhitespaces(stem1);
		printStars(3);

	}
}
