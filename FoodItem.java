package foodOrderApplication;

public class FoodItem {
	String name;
	int price;
	static int ID = 1;
	
	public FoodItem(String n, int p) {
		name = n;
		price = p;
		ID++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getId() {
		return ID;
	}
	
	public void printFood() {
		System.out.printf("  %s   %d", name,price);
	}
}
