package learning_java;

import java.util.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;

public class Exercise_67_Variance {
	public static void main(String[] args) throws InterruptedException {
		Scanner reader = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(
				"This program will find the variance for any numbers that you put in. Print '0' when you are done");
		TimeUnit.SECONDS.sleep((long) 4.5);
		slowPrint("What numbers are you going to put in?", 50);
		TimeUnit.SECONDS.sleep((long) 1);
		int counter = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		boolean flag = true;
		while (flag == true) {
			System.out.println("Type in a number: ");
			int number = Integer.parseInt(reader.nextLine());
			numbers.add(number);
			if (number == 0) {
				flag = false;
			}

		}
		numbers.remove(numbers.size() - 1);
		slowPrint("The variance is: " + variance(numbers), 24);
	}

	public static double variance(ArrayList<Integer> arrayListIn) throws InterruptedException {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		double retVal = 0;
		double avg = average(arrayListIn);
		int counter = 0;

		while (counter < arrayListIn.size()) {
			int number = arrayListIn.get(counter);

			numbers.add(number);
			counter++;
		}
		counter = 0;
		ArrayList<Double> step2 = new ArrayList<Double>();
		slowPrint("calculated components of average: " + numbers, 24);

		slowPrint("calculated average: " + avg, 24);

		double preSubtract = avg;
		double subtract = 0;
		while (counter < arrayListIn.size()) {
			subtract = (double) (arrayListIn.get(counter)) - preSubtract;
			step2.add(subtract);
			counter++;
		}
		slowPrint("Step2 completed, numbers are: " + step2, 24);
		slowPrint("Now squaring...", 24);
		TimeUnit.SECONDS.sleep((long) 1.5);
		counter = 0;
		while (counter < step2.size()) {
			step2.set(counter, step2.get(counter) * step2.get(counter));
			counter++;
		}
		System.out.println("Done");
		TimeUnit.SECONDS.sleep((long) 0.7);
		slowPrint("Step 3 completed, averages squared:" + step2, 24);

		counter = 0;
		int arrSize = step2.size();
		double sumDouble = 0;

		while (counter < arrSize) {
			sumDouble += step2.get(counter);
			counter++;
		}
		slowPrint("Numbers added up: " + sumDouble, 24);
		int amount = arrayListIn.size() - 1;
		double ANSWER = sumDouble / amount;
		slowPrint("Calculating answer...", 24);
		TimeUnit.SECONDS.sleep(3);
		return ANSWER;
	}

	public static double average(ArrayList<Integer> list) {

		int a = 0;
		int s = list.size();
		int sum = 0;
		double b = 0;
		while (a < s) {
			b = list.get(a);
			sum += b;
			a++;

		}
		double sum1 = 1.0 * sum / s;
		return sum1;
	}

	/**
	 * Function to print each character in a string with a delay (a "typewriter"
	 * effect)
	 * 
	 * @param message       The string to print
	 * @param millisPerChar Milliseconds to take to print each character
	 */
	public static void slowPrint(String message, long millisPerChar) {
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i));

			try {
				Thread.sleep(millisPerChar);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
