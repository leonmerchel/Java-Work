package learning_java;
import java.util.*;
public class Exercise_70 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(4);
		list1.add(3);
		list2.add(5);
		list2.add(10);
		list2.add(7);
		
		
		combine (list1, list2);
		System.out.println(list1);
		System.out.println(list2);
	}
	public static void combine (ArrayList<Integer> list1, ArrayList<Integer> list2) {
		list1.addAll(list2);
	}
}
