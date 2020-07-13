package learning_java;

import java.util.ArrayList;

public class Lesson_17 {
	public static void main(String[] args) {
		ArrayList<String> teachers = new ArrayList<String>();
		
		teachers.add("Anthony");
		teachers.add("Barto");
		teachers.add("Paul");
		teachers.add("John");
		teachers.add("Martin");
		teachers.add("Matt");
		System.out.println("the number of teachers " + teachers.size() );
		System.out.println("first teacher on the list " + teachers.get(0));
		System.out.println("third teacher on the list " + teachers.get(2));
		
		
		teachers.remove("Barto");
		if (teachers.contains ("Barto")) {
			System.out.println("Barto is on the teachers list");
		}
		else {
			System.out.println("Barto is not on the teachers list");
		}
		for (String teacher : teachers) {
			System.out.println( teacher ); ;
		}
		}
}
