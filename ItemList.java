

public class ItemList {
	public static String[] itemNames = {
		"Red Potion",
		"Muramasa",
		"Claymore",
        "Novice Sword",
        "Novice Suit",
        "Heavy Armor"
	};

	public static Item createItem(String name){
		if(name.equals("Red Potion")){
			return new HealingItem("Red Potion", 20);
		}
		else if(name.equals("Muramasa")){
			return new WeaponItem("Muramasa", 40);
		}
		else if(name.equals("Claymore")){
			return new WeaponItem("Claymore", 60);
		}
		else if(name.equals("Novice Sword")){
			return new WeaponItem("Novice Sword", 10);
		}
        else if(name.equals("Novice Suit")){
			return new ArmorItem("Novice Suit", 10);
        }
        else if(name.equals("Heavy Armor")){
			return new ArmorItem("Heavy Armor", 60);
		}
		return null;
	}
}
