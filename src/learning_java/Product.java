package learning_java;

public class Product {

	private String ProductName;
	private double Price;
	private int amount;

	public Product(double initPrice, int initAmount, String initialName) {
		this.Price = initPrice;
		this.amount = initAmount;
		this.ProductName = initialName;
	}

	public void printPerson() {
		boolean inStock = this.amount > 0;
		String availableAmount = ", number available: " + this.amount;
		if(inStock) {
			System.out.println(this.ProductName + ", price " + this.Price + " In stock: " + inStock + availableAmount);
		} else {
			System.out.println(this.ProductName + ", price " + this.Price + " In stock: " + inStock);
		}
		

	}

	public static void main(String[] args) {
		Product p = new Product(0.25, 1, "banana");
		p.printPerson();
	}
}