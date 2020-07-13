package learning_java;

import java.lang.Math;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean earlier(MyDate compared) {
		// first we'll compare years
		if (this.year < compared.year) {
			return true;
		}

		// if the years are the same, we'll compare the months
		if (this.year == compared.year && this.month < compared.month) {
			return true;
		}

		// years and months the same, we'll compare the days
		if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
			return true;
		}

		return false;
	}

	public void advance() {
		if (this.day == 30) {
			this.day = 1;
			if (this.month == 12) {
				this.month = 1;
				this.year++;
			} else {
				this.month++;
			}

		} else {
			this.day++;
		}
	}

	public void advance(int numberOfDays) {
		int i = 0;
		while (i < numberOfDays) {
			advance();
			i++;
		}
	}

	public MyDate afterNumberOfDays(int days) {
		MyDate newMyDate = new MyDate(this.day, this.month, this.year);
		newMyDate.advance(days);
		return newMyDate;
	}

	public int differenceInYears(MyDate comparedDate) {
		int thisDate = convertToDate(this);
		int otherDate = convertToDate(comparedDate);

		int differenceInDates = Math.abs(thisDate - otherDate);
		return differenceInDates / 360;
	}

	public int convertToDate(MyDate date) {
		int inDate = date.day + date.month * 30 + date.year * 12 * 30;
		return inDate;
	}

	public static void main(String[] args) {
		MyDate first = new MyDate(24, 12, 2009);
		MyDate second = new MyDate(1, 1, 2011);
		MyDate third = new MyDate(25, 12, 2010);

		System.out.println(first + " and " + second + " difference in years: " + second.differenceInYears(first));
		System.out.println(second + " and " + first + " difference in years: " + first.differenceInYears(second));
		System.out.println(first + " and " + third + " difference in years: " + third.differenceInYears(first));
		System.out.println(third + " and " + first + " difference in years: " + first.differenceInYears(third));
		System.out.println(third + " and " + second + " difference in years: " + second.differenceInYears(third));
		System.out.println(second + " and " + third + " difference in years: " + third.differenceInYears(second));
	}

}
