package learning_java;

public class Counter {

	private int value;
	private boolean check;

	public Counter(int startingValue, boolean check) {
		this.value = startingValue;
		this.check = check;
	}

	public Counter(int startingValue) {
		this.value = startingValue;
	}

	public Counter(boolean check) {
		this.check = check;
	}

	public Counter() {
		this.value = 0;
	}

	public void grow() {
		this.value++;
	}

	public int Value() {
		return value;
	}

	public void increase() {
		value++;
	}

	public void decrease() {
		if (value == 0) {
		} else {
			value--;
		}
	}

	public String toString() {
		return "value: " + value;
	}

	public Counter clone() {
		// lets create a new counter object, that gets as its initial value
		// the value of the counter that is being cloned
		Counter clone = new Counter(this.value);

		// return the clone to the caller
		return clone;
	}

	public void increaseAmount(int amount) {
		value = value + amount;
	}

	public void decreaseAmount(int amount) {
		if (amount > value) {
		} else {
			value = value - amount;
		}
	}

	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.grow();
		counter.grow();

		System.out.println(counter); // prints 2

		Counter clone = counter.clone();

		System.out.println(counter); // prints 2
		System.out.println(clone); // prints 2

		counter.grow();
		counter.grow();
		counter.grow();
		counter.grow();

		System.out.println(counter); // prints 6
		System.out.println(clone); // prints 2

		clone.grow();

		System.out.println(counter); // prints 6
		System.out.println(clone); // prints 3

	}
}
