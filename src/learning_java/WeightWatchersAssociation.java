package learning_java;

import java.util.ArrayList;

public class WeightWatchersAssociation {
	private double lowestWeightIndex;
	private String name;
	private ArrayList<Person> members;

	public WeightWatchersAssociation(String name, double lowestWeightIndex) {
		this.lowestWeightIndex = lowestWeightIndex;
		this.name = name;
		this.members = new ArrayList<Person>();
	}

	public boolean isAccepted(Person person) {
		if (person.weightIndex() < this.lowestWeightIndex) {
			return false;
		}

		return true;
	}

	public void addAsMember(Person person) {
		if (!isAccepted(person)) { // same as isAccepted(person) == false
			return;
		}

		this.members.add(person);
	}

	public String toString() {
		String membersAsString = "";

		for (Person member : this.members) {
			membersAsString += "  " + member.getName() + "\n";
		}

		return "Weightwatchers association " + this.name + " members: \n" + membersAsString;
	}

	public Person personWithHighestWeightIndex() {
		// if members list is empty, we'll return null-reference
		if (this.members.isEmpty()) {
			return null;
		}

		Person heaviestSoFar = this.members.get(0);

		for (Person person : this.members) {
			if (person.weightIndex() > heaviestSoFar.weightIndex()) {
				heaviestSoFar = person;
			}
		}

		return heaviestSoFar;
	}

	public static void main(String[] args) {
		WeightWatchersAssociation weightWatcher = new WeightWatchersAssociation("Kumpulan paino", 25);

		Person matti = new Person("Matti");
		matti.setWeight(86);
		matti.setHeight(180);
		weightWatcher.addAsMember(matti);

		Person juhana = new Person("Juhana");
		juhana.setWeight(64);
		juhana.setHeight(172);
		weightWatcher.addAsMember(juhana);

		Person harri = new Person("Harri");
		harri.setWeight(104);
		harri.setHeight(182);
		weightWatcher.addAsMember(harri);

		Person petri = new Person("Petri");
		petri.setWeight(112);
		petri.setHeight(173);
		weightWatcher.addAsMember(petri);

		System.out.println(weightWatcher);
		Person heaviest = weightWatcher.personWithHighestWeightIndex();
		System.out.print("member with the greatest weight index: " + heaviest.getName());
		System.out.println(" weight index " + String.format("%.2f", heaviest.weightIndex()));
	}
}
