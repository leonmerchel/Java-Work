package learning_java;

import java.util.Scanner;

public class Exercise_55 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type in a word: ");
		String word = reader.nextLine();
		System.out.println("Type in another word: ");
		String word2 = reader.nextLine();
		if (word.indexOf(word2) > -1) {
			System.out.println("the word " + word2 + " is in " + word);
		} else {
			System.out.println("The word " + word2 + " is not in " + word);
		}
	}
}
