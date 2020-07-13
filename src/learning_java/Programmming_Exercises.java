package learning_java;

public class Programmming_Exercises {
	public static void main(String[] args) {
		for (int i = 1;i <= 99; i++) {
			if (i % 2!= 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("Divisible by 3");
		System.out.println();
		for (int a = 1; a <= 99; a++) {
			if (a % 3 == 0) {
				System.out.print(a + ", ");
			}
			
		}
		System.out.println();
		System.out.println("Divisible by 5");
		System.out.println();
		for (int a1 = 1; a1 <= 99; a1++) {
			if (a1 % 5 == 0) {
				System.out.print(a1 + ", ");
			}
		}
		System.out.println();
		System.out.println("Divisible by 15");
		System.out.println();
		for (int a2 = 1; a2 <= 99; a2++) {
			if (a2 % 15 == 0) {
				System.out.print(a2 + ", ");
			}
		}
		
	}
}
