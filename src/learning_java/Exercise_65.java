package learning_java;

import java.util.*;
import java.util.Scanner;

public class Exercise_65 {
	public static void main(String[] args) {
		// Scanner reader = new Scanner(System.in);
		ArrayList<String> stringsArray = new ArrayList<String>();
		stringsArray.add("Hallo");
		stringsArray.add("Moi");
		stringsArray.add("Buenvenuto");
		stringsArray.add("badger badger badger badger");
		ArrayList<Integer> lengths = lengths(stringsArray);
		System.out.println("The lengths of the strings: " + lengths);
	}

//	public static ArrayList<Integer> lengths(ArrayList<String> arraylistIN) {
//		int a = 0;
//		String b = arraylistIN.get(a);
//		int len = b.length();
//		
//		while (a < arraylistIN.size()) {
//			len = b.length();
//			arraylistIN.add (b);
//			a++;
//			
//		}
//		
//		return list;
//	}

	public static ArrayList<Integer> lengths(ArrayList<String> arraylistIN) {

		ArrayList<Integer> arrayListOfLengths = new ArrayList();
		int counter = 0;
		while (counter < arraylistIN.size()) {
			arrayListOfLengths.add(arraylistIN.get(counter).length());
			counter++;
		}

		return arrayListOfLengths;
	}

}
