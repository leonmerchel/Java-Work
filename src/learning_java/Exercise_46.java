package learning_java;

public class Exercise_46 {
	public static void main(String[] args) {
		double realAnswer = answer( 4,3,6,1);
		System.out.println("Average: " + realAnswer);
	}
	public static double answer(double a,double b , double c, double d) {
		double answer1 = a+b+c+d;
		double answer = answer1 / 4;
		return answer;
	}
}
