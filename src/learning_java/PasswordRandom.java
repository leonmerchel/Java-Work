package learning_java;

import java.util.Random;

public class PasswordRandom {
	private int length;
	private Random Random;
	private String ABC = "abcdefghijklmnopqrstuvwxyz";

	public PasswordRandom(int length) {
		Random = new Random();
		this.length = length;
	}

	public String CreatePassword() {
		int counter = 0;
		String Pass = "";
		while (counter < length) {
			int random = Random.nextInt(25);
			char character = ABC.charAt(random);
			Pass = Pass + character;
			counter++;

		}
		return Pass;

	}

	public static void main(String[] args) {
		PasswordRandom randomizer = new PasswordRandom(13);
		System.out.println("Password: " + randomizer.CreatePassword());
		System.out.println("Password: " + randomizer.CreatePassword());
		System.out.println("Password: " + randomizer.CreatePassword());
		System.out.println("Password: " + randomizer.CreatePassword());
	}

}