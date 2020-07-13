package learning_java;

public class Apartment {
	private int rooms;
	private int squareMeters;
	private int pricePerSquareMeter;

	public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
		this.rooms = rooms;
		this.squareMeters = squareMeters;
		this.pricePerSquareMeter = pricePerSquareMeter;
	}

	public boolean larger(Apartment otherApartment) {
		if (this.squareMeters > otherApartment.squareMeters) {
			return true;
		} else {
			return false;
		}
	}

	public int priceDifference(Apartment otherApartment) {
		int price1 = this.squareMeters * this.pricePerSquareMeter;
		int price2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
		if (price1 < price2) {
			int ans = price2 - price1;
			return ans;
		}
		if (price2 < price1) {
			int ans = price1 - price2;
			return ans;
		} else {
			return 0;
		}

	}

	public boolean moreExpensiveThan(Apartment otherApartment) {
		int price1 = this.squareMeters * this.pricePerSquareMeter;
		int price2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
		if (price1 > price2) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Apartment studioManhattan = new Apartment(1, 16, 5500);
		Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
		Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

		System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );       // false
		System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );   // true
	}

}
