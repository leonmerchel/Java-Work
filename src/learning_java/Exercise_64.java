package learning_java;

import java.util.*;
import java.util.Scanner;

public class Exercise_64 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);

		System.out.println("Average is: " + average(list));
	}

	public static double average (ArrayList<Integer> list) {
		int  a = 0;
		int s = list.size();
		int sum = 0;
		double b = list.get(0);
		while (a < s) {
			b = list.get(a);
			sum += b;
			a++;

		}
		double sum1 = 1.0 *sum / s ;
		return sum1;
	}

}
