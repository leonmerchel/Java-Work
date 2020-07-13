package learning_java;

import java.util.*;

public class Sorting {
//	public static int smallest(int[] array) {
//		int i = 0;
//		int p = 1;
//		int next = array[p];
//		int y = array[i];
//		for (int o = 0; o < array.length; o++) {
//			if (y > next) {
//				y = next;
//				i++;
//				p++;
//			}
//
//		}
//		return y;
//	}
//
////	public static int indexOfTheSmallest(int[] array) {
////		int i = 0;
////		int place = 0;
////		int p = 1;
////		int next = array[p];
////		int y = array[i];
////		for (int o = 0; o < array.length; o++) {
////			if (y > next) {
////				y = next;
////				i++;
////				p++;
//				place = p - 1;
//			}
//
//		}
//		return place;
//	}

//	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
//		int i = index;
//		int place = 0;
//		int p = index + 1;
//		int next = array[p];
//		int y = array[i];
//		for (int o = index; o < array.length - 1; o++) {
//			if (y > next) {
//				y = next;
//				i++;
//				p++;
//				place = p - 1;
//			}
//
//		}
//		return place;
//	}
//
//	public static void swap(int[] array, int index1, int index2) {
//		int a = array[index1];
//		int b = array[index2];
//		array[index1] = b;
//		array[index2] = a;
//	}
//
//	public static void sort(int[] array) {
//		int counter = 0;
//		int o = 0;
//		while (counter < array.length) {
//			
//		}
//	}
	public static int smallest(int[] test) {
		int small = test[0];
		for (int i = 0; i < test.length; i++) {
			if (small <= test[i]) {
				// small = small;
			} else {
				small = test[i];
			}
		}
		return small;
	}

	public static int indexOfTheSmallest(int[] test) {
		// code goes here
		int index = 0;
		int small = test[0];
		for (int i = 0; i < test.length; i++) {
			if (small <= test[i]) {

			} else {
				small = test[i];
				index = i;
			}
		}
		return index;
	}

	public static int indexOfTheSmallestStartingFrom(int[] test, int index) {
		int small = test[index];
		for (int i = index; i < test.length; i++) {
			if (small <= test[i]) {

			} else {
				small = test[i];
				index = i;
			}
		}
		return index;
	}

	public static void swap(int[] array, int index1, int index2) {
		int swap1;
		int swap2;

		swap1 = array[index2];
		swap2 = array[index1];

		array[index1] = swap1;
		array[index2] = swap2;
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array));
			int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
			swap(array, i, smallestIndex);
		}
	}


	public static void main(String[] args) {
		int[] values = { 3, 2, 5, 4, 8 };

		System.out.println(Arrays.toString(values));

		swap(values, 1, 0);
		System.out.println(Arrays.toString(values));

		swap(values, 0, 3);
		System.out.println(Arrays.toString(values));

	}

}
