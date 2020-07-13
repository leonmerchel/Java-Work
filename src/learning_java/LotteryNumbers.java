package learning_java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class LotteryNumbers {
	private ArrayList<Integer> numbers;
	private Random random;

	
	public LotteryNumbers() {
		this.numbers = new ArrayList<Integer>();
		random = new Random();
		this.drawNumbers();
	}

	public ArrayList<Integer> numbers() {
		return numbers;
	}

	public void drawNumbers() {
		
		int randomm = 0;
		while ( numbers.size() <= 6) {
			randomm = random.nextInt(38) + 1;
			
			if( ! numbers.contains(randomm) ) {
				numbers.add(randomm);
			}
						
			
			
		}
	}



	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		LotteryNumbers lotteryNumbers = new LotteryNumbers();
		ArrayList<Integer> numbers = lotteryNumbers.numbers();
		ArrayList<Integer> UserNumbers = new ArrayList<Integer>();
		System.out.println("Type in numbers.");
		int a = Integer.parseInt(reader.nextLine());
		int b = Integer.parseInt(reader.nextLine());
		int c = Integer.parseInt(reader.nextLine());
		int d = Integer.parseInt(reader.nextLine());
		int e = Integer.parseInt(reader.nextLine());
		int f = Integer.parseInt(reader.nextLine());
		int g = Integer.parseInt(reader.nextLine());
		
		UserNumbers.add(a);
		UserNumbers.add(b);
		UserNumbers.add(c);
		UserNumbers.add(d);
		UserNumbers.add(e);
		UserNumbers.add(f);
		UserNumbers.add(g);
		System.out.println("Lottery numbers: ");
		for (int number : numbers) {
			System.out.print(number  + " ");
		}
		int o = 0;
		int counter = 0;
		while (counter <= 6) {
			if (counter == 7) {
				break;
			}
			if (numbers.contains(UserNumbers.get(counter))) {
				o++;
				counter++;
			}
			else {
				counter++;
			}
		}
		if (o >= 2) {
			System.out.println("Congratulations, you got " + o + "numbers right!");
		}
		else {
			System.out.println("You did not win anything. You got " + o + " numbers right.");
		}
	}
}
