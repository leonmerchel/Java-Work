package learning_java;

import java.util.*;

public class Lesson_20 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(3);
		numbers.add(7);
		numbers.add(3);

		System.out.println("The numbers in the beginning:");

		
			System.out.println(numbers);

		while (numbers.contains(Integer.valueOf(3))) {
			numbers.remove(Integer.valueOf(3));
		}

		System.out.println("The numbers after removal:");

			System.out.println(numbers);
		
	}
}
