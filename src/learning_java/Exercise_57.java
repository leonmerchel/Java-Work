package learning_java;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_57 {
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
			System.out.println(words.get(counter));
			counter++;

		}

	}
}
