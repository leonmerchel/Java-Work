package learning_java;
import java.util.*;
import java.util.Scanner;

public class Exercise_62 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("zack");
		brothers.add("harry");
		brothers.add("andrew");
		brothers.add("bob");
		
		System.out.println("brothers:");
		System.out.println(brothers);
		
		brothers.sort(null);
		
		removeLast(brothers);
		System.out.println(brothers);
		
	}
	public static void removeLast (ArrayList<String> list) {
		int a = list.size();
		int b = a - 1;
		list.remove(b);
		
		
	}
}
