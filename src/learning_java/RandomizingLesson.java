package learning_java;
import java.util.Random;
public class RandomizingLesson {
	public static void main(String[] args) {
		Random randomizer = new Random();
		int i = 0;
		
		while (i < 120) {
			System.out.println(randomizer.nextInt(10));
			i++;
		}
	}
}
