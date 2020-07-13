package learning_java;

import java.util.Scanner;
import java.util.*;

public class Exercise_97 {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int[] array = { 5, 1, 3, 4, 2 };
		printElegantly(array);

		System.out.print(" How many values? ");
	

		int[] values = new int[Integer.parseInt(reader.nextLine())];
		System.out.print(values);
	}

	public static void printElegantly(int[] array) {
		int i = 0;
		while (i < array.length - 1) {

			System.out.print(array[i] + ", ");
			i++;
		}
		System.out.print(array[array.length - 1]);
	}

}
