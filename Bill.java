package foodOrderApplication;
import java.util.*;

public class Bill {
	List<OrderItem> bill;
	int total;
	
	public Bill() {
		bill = new ArrayList<OrderItem>();
	}
	
	public void addOrderItem(OrderItem order) {
		if(!bill.contains(order)){
			bill.add(order);
		}else {
			bill.get(bill.indexOf(order)).incrQty();
		}
		total += order.getTotal();
	}
	
	public void removeOne(int indx) {
		if(bill.get(indx).getQty()>0) {
			bill.get(indx).decQty();
			total -= bill.get(indx).getTotal()/bill.get(indx).getTotal();
		}else {
			total -= bill.get(indx).getTotal();
			bill.remove(indx);
		}
	}
	
	public void removeOrder(int indx) {
		total -= bill.get(indx).getTotal();
		bill.remove(indx);
		
	}
	
	public void removeBill() {
		bill = new ArrayList<>();
		total = 0;
	}
	
	public void printBill() {
		for(OrderItem order : bill) {
			order.printItem();
			System.out.println();
		}
		System.out.printf("Total         %d", total);
	}
}
