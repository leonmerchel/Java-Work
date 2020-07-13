package learning_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_58 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		boolean flag = true;
		while (flag) {
			System.out.println("Type in a word");

			String wordIn = reader.nextLine();

			if (words.contains(wordIn)) {
				System.out.println("The word " + wordIn + " has been said twice");
				flag = false;
			} else {
				words.add(wordIn);

			}

		}
	}
}
