package learning_java;
import java.util.*;
public class Lesson_19 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(3);
		numbers.add(7);
		numbers.add(3);
		
		int number = 1;
		number = addThreeAndReturn(number);
		
		System.out.println(number);
		
	}
	public static int addThreeAndReturn(int incremented) {
		incremented = incremented + 3;
		return incremented;
	}
}
