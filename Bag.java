
import java.util.*;

public class Bag {
	private ArrayList<Item> items;
	private int maxItem;

	public Bag(){
		items = new ArrayList<Item>();
		maxItem = 10;
	}

	public boolean addItem(Item item){
		if(items.size() <= maxItem){
			items.add(item);
			return true;
		}

		return false;
	}

	public void listItem(){
		System.out.println("Item List in Bag");

		for(Item item: items){
			System.out.println(item);
		}
	}

}
