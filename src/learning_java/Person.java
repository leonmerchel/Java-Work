package learning_java;

import java.util.*;
import java.util.Calendar;

public class Person {

	private String name;
	private int age;
	private int height;
	int weight;
	private MyDate birthMyDate;
	private String number;

	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.weight = 0;
		this.height = 0;
		this.birthMyDate = new MyDate(day, month, year);
	}

	public Person(String name) {

		this.name = name;
		this.weight = 0;
		this.height = 0;
		this.age = 1;
		this.birthMyDate = new MyDate(Calendar.getInstance().get(Calendar.DATE),
				Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
	}

	public Person(String name, MyDate birthday) {
		this.name = name;
		this.birthMyDate = birthday;
	}
	
	public Person(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public void printPerson() {
		System.out.println(this.name + " I am " + this.age + " years old");
	}

	public void becomeOlder() {
		this.age++;
	}

	public boolean adult() {
		if (this.age < 18) {
			return false;
		}

		return true;
	}

	boolean olderThan(Person compared) {
		if (this.age < compared.age || this.age == compared.age) {
			return false;
		} else {
			return true;
		}
	}

	public int age() {
		MyDate today = new MyDate(Calendar.getInstance().get(Calendar.DATE),
				Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
		return today.differenceInYears(birthMyDate);
	}

	public double weightIndex() {
		double heightInMeters = this.height / 100.0;

		return this.weight / (heightInMeters * heightInMeters);
	}
	
	public void changeNumber(String Number) {
		this.number = Number;
	}

//	public String toString() {
//		return this.name + ", born " + this.birthMyDate;
//	}
	
	public String toString() {
		return (this.name + " number: " + this .number);
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}
	public String getNumber() {
		return number;
	}

	public static void main(String[] args) {
		 Person pekka = new Person("Pekka Mikkola", "040-123123");

		    System.out.println(pekka.getName());
		    System.out.println(pekka.getNumber());

		    System.out.println(pekka);
		    pekka.changeNumber("050-333444");
		    System.out.println(pekka);
	}
}