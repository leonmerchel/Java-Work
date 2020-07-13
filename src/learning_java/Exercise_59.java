package learning_java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Exercise_59 {
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
				words.remove(a);
			}
		}
		int size = words.size() - 1;
		System.out.println("You printed: ");
		while (size > -1) {
			System.out.println(words.get(size));
			size--;
		}
		
	}
}
