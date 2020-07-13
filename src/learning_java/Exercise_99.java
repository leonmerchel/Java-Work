package learning_java;

public class Exercise_99 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 3, 4, 2 };
		printArrayAsStars(array);
	}

	public static void printArrayAsStars(int[] array) {
		int i = 0;
		int otherI = 0;
		while (i < array.length) {
			otherI = 0;
			while (otherI < array[i]) {
				System.out.print("*");
				otherI++;
			}
			System.out.println("");
			i++;
		}
	}
}
