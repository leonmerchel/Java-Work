package learning_java;

public class Exercise_96 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 3, 4, 2 };
		System.out.println(sum(array));
	}

	public static int sum(int[] array) {
		int i = 0;
		int sum = 0;
		while (i < array.length) {
			sum = sum + array[i];
			i++;
		}
		return sum;
	}
}
