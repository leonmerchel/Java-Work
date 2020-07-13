package learning_java;
import java.util.Random;
public class Dice {
	private Random random;
	private int numberOfSides;
	
	public Dice (int NumberOfSides) {
		random = new Random();
		this.numberOfSides = NumberOfSides;
	}
	
	public int roll() {
		int randomm = random.nextInt(numberOfSides);
		System.out.println(randomm);
		return randomm;
	}
	
	public String toString() {
		System.out.println("number of sides:" + numberOfSides);
		return "";
	}
	public static void main(String[] args) {
		Dice dice = new Dice(6);
		System.out.println("got here with dice:" + dice.toString());
		int i = 0;
		while (i < 10) {
			dice.roll();
			i++;
		}
	}
}
