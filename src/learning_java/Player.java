package learning_java;

public class Player {
	public String name;
	public int goals;

	public Player(String name, int goals) {
		this.goals = goals;
		this.name = name;
	}

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int goals() {
		return goals;
	}

	public String toString() {
		return (name + ", goals: " + goals);
	}

	public static void main(String[] args) {
		Team barcelona = new Team("FC Barcelona");
		System.out.println("Team: " + barcelona.getName());

		Player brian = new Player("Brian");
		System.out.println("Player: " + brian);

		Player pekka = new Player("Pekka", 39);
		System.out.println("Player: " + pekka);
	}
}
