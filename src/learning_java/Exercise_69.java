package learning_java;

import java.util.*;
import java.util.Scanner;
import java.util.Collections;

public class Exercise_69 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a word: ");
		String text = reader.nextLine();
		if (palindrome(text)) {
			System.out.println("The text is a palindrome!");

		} else {
			System.out.println("The text is not a palindrome!");
		}
	}

	
	////////////////////////////////////////////////////////////////////////////////////////////////
	// function takes in a string and returns a boolean - true if polidrome, false if not polidrome
	/////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean palindrome(String text) {
		
		return text.equals( reverse(text)  );
		
	}
	
	///////////////////////////////////////////
	// function takes in a string and returns a reverse string
	////////////////////////////////////////////
	public static String reverse(String text) {
		int count = text.length()-1;
		String returnString ="";
				
		
		while (count > - 1) {
			returnString += text.charAt(count);
			count--;
		}
		
		return returnString;
		
	}
}
