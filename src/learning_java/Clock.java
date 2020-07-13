package learning_java;

import java.util.Scanner;

public class Clock {
	private BoundedCounter hours;
	private BoundedCounter minutes;
	private BoundedCounter seconds;

	public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
	    // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
	    this.hours = new BoundedCounter(23);
	    this.hours.setValue(hoursAtBeginning);

	    this.minutes = new BoundedCounter(59);
	    this.minutes.setValue(minutesAtBeginning);

	    this.seconds = new BoundedCounter(59);
	    this.seconds.setValue(secondsAtBeginning);


	}
	public void tick() { //increases the time

        this.seconds.next();

        if (this.seconds.getValue() == 0) {
            this.minutes.next();

            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }

	public String toString() {
		return (hours + ":" + minutes + ":" + seconds);
		// returns the string representation
	}

	public static void main(String[] args) {
		Clock clock = new Clock(23, 59, 50);

		int i = 0;
		while (i < 20) {
			System.out.println(clock);
			clock.tick();
			i++;
		}
	}
}
