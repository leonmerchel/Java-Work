package learning_java;

import java.util.*;

public class Grade_Distribution {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Put in exam results:");
		int a = 0;
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		while (a >= 0 && a < 61) {
			a = Integer.parseInt(reader.nextLine());
			if (a <= 29 && a > -1) {
				zero++;
			} else if (a >= 50 && a <= 60) {
				five++;
			} else if (a >= 45 && a <= 49) {
				four++;
			} else if (a >= 40 && a <= 44) {
				three++;
			} else if (a >= 35 && a <= 39) {
				two++;
			} else if (a >= 30 && a <= 34) {
				one++;
			}
		}
		int c = 0;
		int co = 0;
		int cou = 0;
		int coun = 0;
		int count = 0;
		int counte = 0;
		String cero = "";
		String uno = "";
		String dos = "";
		String tres = "";
		String cuatro = "";
		String cinco = "";
		String star = "*";
		while (c < zero) {
			cero = cero + star;
			c++;
		}
		while (co < one) {
			uno = uno + star;
			co++;
		}
		while (cou < two) {
			dos = dos + star;
			cou++;
		}
		while (coun < three) {
			tres = tres + star;
			coun++;
		}
		while (count < four) {
			cuatro = cuatro + star;
			count++;
		}
		while (counte < five) {
			cinco = cinco + star;
			counte++;
		}
		System.out.println("5: " + cinco);
		System.out.println("4: " + cuatro);
		System.out.println("3: " + tres);
		System.out.println("2: " + dos);
		System.out.println("1: " + uno);
		System.out.println("0: " + cero);
	}
}
