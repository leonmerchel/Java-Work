package learning_java;

import java.util.*;

public class BoundedCounter {

	int value;
	private int upperLimit;

	public BoundedCounter(int upperLimit) {
		this.value = 0;
		this.upperLimit = upperLimit;
	}

	public void next() {
		value++;
		if (value > upperLimit)
			value = 0;
	}

	public String toString() {
		if (value < 10) {
			return "0" + value;
		} else {
			return "" + value;
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int val) {
		if (val >= 0 && val <= upperLimit) {
			value = val;
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type in hours: ");
		int h = Integer.parseInt(reader.nextLine());
		BoundedCounter hours = new BoundedCounter(23);
		hours.setValue(h);

		System.out.println("Type in minutes: ");
		int m = Integer.parseInt(reader.nextLine());
		BoundedCounter minutes = new BoundedCounter(59);
		minutes.setValue(m);

		System.out.println("Type in seconds: ");
		int s = Integer.parseInt(reader.nextLine());
		BoundedCounter seconds = new BoundedCounter(59);
		seconds.setValue(s);

		
		int i = 0;
		while (i < 121) {
			System.out.println(hours + ":" + minutes + ":" + seconds);
			if (seconds.getValue() == 59)
				minutes.next();
			seconds.next();
			if (minutes.getValue() == 59)
				hours.next();
			i++;
		}
	}

}
