package learning_java;

import java.util.*;

public class Student {
	private String name;
	private String studentNumber;

	public Student(String name, String studentID) {
		this.name = name;
		this.studentNumber = studentID;
	}

	public String getName() {
		return name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public String toString() {
		return name + " (" + studentNumber + ")";
	}

//	public static void Search(String searchword, ArrayList list) {
//		int counte = 0;
//		int count = list.size();
//		ArrayList<String> yeet = new ArrayList<String>();
//		while (counte < count) {
//			if (((String) list.get(counte)).contains(searchword)) {
//				yeet.add((String) list.get(counte));
//				counte++;
//			}
//
//		}
//		System.out.println(yeet);
//	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		String name;
		String number;
		while (true) {
			name = reader.nextLine();
			if (name.isEmpty())
				break;
			number = reader.nextLine();
			Student student = new Student(name, number);
			list.add(student);
		}
		int counte = 0;
		int count = list.size();
		while (counte < count) {
			System.out.println(list.get(counte));
			counte++;
		}

		System.out.println("Type a search parameter");
		String search = reader.nextLine();
		if (list.contains(search)) {

		}
	}
}
