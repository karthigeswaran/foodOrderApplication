package foodOrderApplication;
import java.util.*;

public class MenuCard{
	Map<Integer, FoodItem> menu;
	
	public MenuCard() {
		 menu = new HashMap<Integer, FoodItem>();
	}
	public boolean addItem(FoodItem foodItem) {
		int ID = foodItem.getId();
		menu.put(ID,foodItem);
		return true;
	}
	
	public FoodItem getItem(int id) {
		return menu.get(id);
	}
 
	public void removeItem(int id) {
		menu.remove(id);
	}
	
	public void printMenu() {
		System.out.println("ID    Name        price");
		Iterator<FoodItem> i = menu.values().iterator();
		Iterator<Integer> j = menu.keySet().iterator();
		while(i.hasNext()) {
			System.out.print(j.next());
			i.next().printFood();
			System.out.println();
		}
	}
}
