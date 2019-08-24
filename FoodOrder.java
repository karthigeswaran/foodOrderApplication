package foodOrderApplication;
import java.util.*;

public class FoodOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MenuCard menu = new MenuCard();
		Bill bill = new Bill();
		System.out.println("!!Welcome to order app!!");
		do {
			System.out.println("Menu:\n1.Add Food to Menu\n2.Order food\n3.Generate bill\n choose your option...");
			int c = scan.nextInt();
			switch (c) {
			case 1:
				System.out.print("Enter name:");
				String name = scan.next();
				System.out.print("Enter price(1 nos):");
				int price = scan.nextInt();
				FoodItem newfood = new FoodItem(name,price);
				menu.addItem(newfood);
				break;
			case 2:
				menu.printMenu();
				System.out.print("Enter your choice:");
				int id  = scan.nextInt();
				FoodItem food = menu.getItem(id);
				System.out.print("Enter qty:");
				int qty = scan.nextInt();
				OrderItem order = new OrderItem(qty,food);
				bill.addOrderItem(order);
				break;
			case 3:
				System.out.println("Bill of items");
				bill.printBill();
				break;
			default:
				System.out.println("Incorrect choice:");
			}
			System.out.print("Would u like to continue(y/n):");
			if(scan.next().charAt(0)=='y')
				continue;
			else
				break;
			
		}while(true);
		System.out.println("Thanks for using order app!!");
		scan.close();
	}

}
