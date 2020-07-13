package learning_java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise_60 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		boolean flag = true;
		while (flag == true) {
			System.out.println("Type a word: ");
			String a = reader.nextLine();
			words.add(a);
			if (a.equals("")) {
				flag = false;

			}
		}
		int counter = 0;
		while (counter < words.size()) {

			Collections.sort(words);
			System.out.println(words.get(counter));
			counter++;

		}

	}
}
