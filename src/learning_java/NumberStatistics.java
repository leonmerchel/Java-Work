package learning_java;

import java.util.Scanner;
import java.util.*;

public class NumberStatistics {

	private int amountOfNumbers;
	private int sum;

	public NumberStatistics() {
		this.amountOfNumbers = 0;
	}

	public void addNumber(int number) {
		amountOfNumbers++;
		sum = sum + number;
	}

	public int amountOfNumbers() {
		return amountOfNumbers;
	}

	public int sum() {
		return sum;
	}

	public double average() {
		return 1.0 * sum / amountOfNumbers;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		NumberStatistics stats = new NumberStatistics();
		ArrayList<Integer> Even = new ArrayList<Integer>();
		ArrayList<Integer> Odd = new ArrayList<Integer>();
		int number = 0;
		int sum = 0;
		int otherSum = 0;
		while (true) {
			int a = Integer.parseInt(reader.nextLine());
			if (a == -1) {
				break;
			}
			stats.addNumber(a);
			if ((a % 2) == 0 && a != -1) {
				Even.add(a);
				sum = sum + a;
			}
			if ((a % 2) != 0 && a != -1) {
				Odd.add(a);
				otherSum = otherSum + a;
			}
		}

		System.out.println("Amount: " + stats.amountOfNumbers);
		System.out.println("Sum: " + stats.sum);
		System.out.println("Sum of even: " + sum);
		System.out.println("Sum of odd: " + otherSum);
		System.out.println("Average: " + stats.average());
	}
}
