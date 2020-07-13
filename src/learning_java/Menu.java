package learning_java;

import java.util.*;

public class Menu {
	private static ArrayList<String> meals;

	public Menu() {
		this.meals = new ArrayList<String>();

	}

	public static void addMeal(String meal) {
		meals.add(meal);
	}

	public static void printMeals() {
		System.out.println(meals);
	}

	public void clearMenu() {

		while (meals.size() > 0) {
			meals.remove(0);

		}
	}

	public static void main(String[] args) {
		Menu m = new Menu();
		if (meals == null) {
			System.out.println("meals is null you need to instantiate it!");
		} else {
			System.out.println("meals is not null!");
		}

		m.addMeal("Burgers");
		m.addMeal("fries");
		m.printMeals();
		m.clearMenu();
		m.printMeals();
	}

}
