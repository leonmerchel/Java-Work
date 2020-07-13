package learning_java;

import java.util.*;
import java.util.Scanner;
import java.util.Collections;

public class Exercise_68 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);
		list.add(7);
		list.add(7);

		System.out.println("Type a number: ");
		int number = Integer.parseInt(reader.nextLine());
		int numberOfOccurancesToCheck = 1;
		if (moreThanGivenNumber(list, number, numberOfOccurancesToCheck)) {
			System.out.println(number + " appears more than " + numberOfOccurancesToCheck + " time(s)");
		} else {
			System.out.println(number + " does not appear more than " + numberOfOccurancesToCheck + " time(s)");
		}

	}

	public static boolean moreThanGivenNumber(ArrayList<Integer> list, int number, int occurancesToCheck) {
		boolean retVal = false;
		int numberOfOccurances = 0;
		for (int counter = 0; counter < list.size(); counter++) {
			if (number == list.get(counter)) {
				numberOfOccurances++;
			}
		}

		return (numberOfOccurances > occurancesToCheck);
	}
}
