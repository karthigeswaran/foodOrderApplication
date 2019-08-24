package foodOrderApplication;

public class OrderItem {
	int qty;
	FoodItem food;
	int total;
	public OrderItem(int q,FoodItem f) {
		qty = q;
		food = f;
		total = food.getPrice()*qty;
	}
	public void incrQty() {
		qty++;
		total +=food.getPrice();
	}
	public void decQty() {
		if(qty>0) {
			qty--;
			total -=food.getPrice();
		}
	}
	
	public int getQty() {
		return qty;
	}
	public int getTotal() {
		return total;
	}
	
	public void printItem() {
		food.printFood();
		System.out.printf("   %d %d", qty,total);
	}
}
