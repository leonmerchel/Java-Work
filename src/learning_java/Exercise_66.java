package learning_java;

import java.util.*;
import java.util.Scanner;
import java.util.Collections;
public class Exercise_66 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(8);
		list.add(2);
		
		System.out.println("The greatest number is: " + greatest(list));
		
	}
	public static int greatest (ArrayList<Integer> list) {
		Collections.sort(list);
		Collections.reverse(list);
		return list.get(0);
	}
}
