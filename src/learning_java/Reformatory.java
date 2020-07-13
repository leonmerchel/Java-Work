package learning_java;

public class Reformatory {
	private int weight;
	private String name;
	private int age;
	private int height;
	private int counter;
	
	public int weight(Person person) {
		counter++;
		return person.getWeight();
	}
	public int feed(Person person) {
		int Weight = person.getWeight() + 1;
		person.weight++;
		return Weight;
	}
	public int totalWeightsMeasured() {
		return counter;
	}

	
	public static void main(String[] args) {
		Reformatory eastHelsinkiReformatory = new Reformatory();

	    Person brian = new Person("Brian", 1, 110, 7);
	    Person pekka = new Person("Pekka", 33, 176, 85);

	    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

	    eastHelsinkiReformatory.weight(brian);
	    eastHelsinkiReformatory.weight(pekka);

	    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

	    eastHelsinkiReformatory.weight(brian);
	    eastHelsinkiReformatory.weight(brian);
	    eastHelsinkiReformatory.weight(brian);
	    eastHelsinkiReformatory.weight(brian);

	    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
	}
}
