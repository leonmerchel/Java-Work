package learning_java;

public class CashRegister {
	private double cashInRegister; // the amount of cash in the register
	private int economicalSold; // the amount of economical lunches sold
	private int gourmetSold; // the amount of gourmet lunches sold

	public CashRegister() {
		cashInRegister = 1000;
	}

	public double payEconomical(double cashGiven) {
		if (cashGiven == 2.50) {
			economicalSold++;
			cashInRegister += 2.50;
			return 0;
		}
		if (cashGiven > 2.50) {
			economicalSold++;
			cashInRegister += 2.50;
			return cashGiven - 2.50;
		} else {
			return cashGiven;
		}
	}

	public double payGourmet(double cashGiven) {
		if (cashGiven == 4.00) {
			gourmetSold++;
			cashInRegister += 4.00;
			return 0;
		}
		if (cashGiven > 4.00) {
			gourmetSold++;
			cashInRegister += 4.00;
			return cashGiven - 4.00;
		} else {
			return cashGiven;
		}
	}

	public boolean payEconomical(LyyraCard card) {
		if (LyyraCard.balance == 2.50 || LyyraCard.balance > 2.50) {
			economicalSold++;
			LyyraCard.balance -= 2.50;
			return true;
		} else {
			return false;
		}
	}

	public boolean payGourmet(LyyraCard card) {
		if (LyyraCard.balance == 4.00 || LyyraCard.balance > 4.00) {
			gourmetSold++;
			LyyraCard.balance -= 4.00;
			return true;
		} else if (LyyraCard.balance < 4.00) {
			return false;
		}
		return false;
	}

	public void loadMoneyToCard(LyyraCard card, double sum) {
		double check = card.balance + sum;
		if (check < 0) {
			
		}
		else if (check == 0 || check > 0){
			card.balance += sum;
			cashInRegister += sum;
		}
		
	}

	public String toString() {
		return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold
				+ " gourmet lunches sold: " + gourmetSold;
	}

	public static void main(String[] args) {
		CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );
	}
}
