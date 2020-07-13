package learning_java;

import java.util.Scanner;
import java.util.*;

public class NumberStatistics2 {

	private int amountOfNumbers;
	private int sum;

	public NumberStatistics2() {
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
		NumberStatistics2 stats = new NumberStatistics2();
		NumberStatistics2 even = new NumberStatistics2();
		NumberStatistics2 odd = new NumberStatistics2();
		while (true) {
			int a = Integer.parseInt(reader.nextLine());
			if (a == -1) {
				break;
			}
			stats.addNumber(a);
			if ((a % 2) == 0 && a != -1) {
				even.addNumber(a);
			}
			if ((a % 2) != 0 && a != -1) {
				odd.addNumber(a);
			}
		}

		System.out.println("Amount: " + stats.amountOfNumbers);
		System.out.println("Sum: " + stats.sum);
		System.out.println("Sum of even: " + even.sum);
		System.out.println("Sum of odd: " + odd.sum);
		System.out.println("Average: " + stats.average());
	}

}
