package learning_java;

public class OriginalLyyraCard {
	private double balance;

	public OriginalLyyraCard(double balanceAtStart) {
		this.balance = balanceAtStart;
	}

	public String toString() {
		String returnType =   "This card's balance has " + "$" + balance + " euros";
		return returnType;
	}

	public void payEconomical() {
		if (balance < 2.5) {
			System.out.println("Card do not have enough money to buy and Economical order. Current Amount: " + "$"
					+ balance + "  " + "Balance needed: $2.50");
		} else {
			System.out.println("Card bought and Economical order and paid $2.50");
			balance -= 2.5;
		}

	}

	public void payGourmet() {
		if (balance < 4) {
			System.out.println("Card does not have enough money to buy and Gourmet order. Current Amount: " + "$" + balance
					+ "  " + "Balance needed: $4.00");
		} else {
			System.out.println("Card bought and Gourmet order and paid $4.00");
			balance -= 4;
		}

	}

	public void loadmoney(double amount) {
		if (balance < 0) {
			System.out.println("Card cannot load a negative amount into your account");
		} else if (balance > 150) {
			
			int a = 150;
			int b = (int) balance;
			int c = b - a;
			balance -= c;
			System.out.println("Balance has been capped at $150.00.");
		}
		else {
			balance += amount;
			System.out.println("This card has added : " + "$" + amount);
		}
		
	}

	public static void main(String[] args) {
		OriginalLyyraCard Pekka = new OriginalLyyraCard(20);
		OriginalLyyraCard Brian = new OriginalLyyraCard(30);
		Pekka.payGourmet();
		Brian.payEconomical();
		System.out.println(Pekka);
		System.out.println(Brian);
		Pekka.loadmoney(20);
		Brian.payGourmet();
		System.out.println(Pekka);
		System.out.println(Brian);
		Pekka.payEconomical();
		Pekka.payEconomical();
		Brian.loadmoney(50);;
		System.out.println(Pekka);
		System.out.println(Brian);
		
		
		


	}
}
