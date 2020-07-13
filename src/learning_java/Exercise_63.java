package learning_java;

import java.util.*;
import java.util.Scanner;

public class Exercise_63 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);

		System.out.println("Sum is: " + sum(list));
	}

	public static int sum(ArrayList<Integer> list) {
		int a = 0;
		int s = list.size();
		int sum = 0;
		int b = list.get(0);
		while (a < s) {
			b = list.get(a);
			sum += b;
			a++;

		}
		return sum;
	}

}
