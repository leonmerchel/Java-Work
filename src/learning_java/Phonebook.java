package learning_java;

import java.util.*;

public class Phonebook {
	private ArrayList<Person> phoneBook;

	public Phonebook() {
		this.phoneBook = new ArrayList<Person>();
	}

	public void printAll() {
		for (Person person : phoneBook) {
			System.out.println(person);

		}
	}

	public void add(String name, String number) {
		phoneBook.add(new Person(name, number));
	}

	public String searchNumber(String name) {
		for (Person person : phoneBook) {
			if (person.getName().contains(name)) {
				return person.getNumber();
			}
		}
		return "number not known";
	}

	public static void main(String[] args) {
		Phonebook phonebook = new Phonebook();
		phonebook.add("Pekka Mikkola", "040-123123");
		phonebook.add("Edsger Dijkstra", "045-456123");
		phonebook.add("Donald Knuth", "050-222333");

		String number = phonebook.searchNumber("Pekka Mikkola");
		System.out.println(number);

		number = phonebook.searchNumber("Martti Tienari");
		System.out.println(number);
	}

}
