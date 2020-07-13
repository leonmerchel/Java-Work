package learning_java;

public class DecreasingCounter {

	private int value;
	int realValue = value;

	public DecreasingCounter(int valueAtStart) {
		this.value = valueAtStart;
		this.realValue = valueAtStart;
	}

	

	public void decrease() {
		value--;
		if (value < 0) {
			value++;
		}
	
	}
	
	public void restart() {
		while (value > 0) {
			value --;
		}
	}
	public void InitialValue() {
		restart();
		value = realValue;
	}
	public void printvalue() {
		System.out.println("value: " + this.value);
	}

	public static void main(String[] args) {

		DecreasingCounter counter = new DecreasingCounter(100);
		counter.printvalue();

		counter.decrease();
		counter.printvalue();
	
		counter.decrease();
		counter.printvalue();

		counter.restart();
		counter.printvalue();
		
		counter.InitialValue();
		counter.printvalue();
	}
}
