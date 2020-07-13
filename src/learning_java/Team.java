package learning_java;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String name;
	private ArrayList<Player> Playerz = new ArrayList<Player>();
	private int maxSize;
	private int teamGoals;

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void printPlayers() {
		int i = 0;
		while (i < Playerz.size()) {
			System.out.println(Playerz.get(i));
			i++;
		} 
	}

	public void addPlayer(Player player) {
		if ( maxSize == 0 || (maxSize > 0 && Playerz.size() < maxSize)) {
			Playerz.add(player);
			teamGoals = teamGoals + player.goals;
		}
		
	}

	public void setMaxSize(int MaxSizeIn) {
		maxSize = MaxSizeIn;

	}

	public int Size() {
		return Playerz.size();
	}

	public int goals() {
		return teamGoals;
	}

	public static void main(String[] args) {
		Team barcelona = new Team("FC Barcelona");

		Player brian = new Player("Brian");
		Player pekka = new Player("Pekka", 39);
		barcelona.addPlayer(brian);
		barcelona.addPlayer(pekka);
		barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

		System.out.println("Total goals: " + barcelona.goals());
	}
}
