

public class MonsterList {
	public static String[] monsterName = {
        "Poring",
        "Bigfoot",
        "Phen"
	};

	public static Monster generateMonster(String name){
		if(name.equals("Poring")){
			return new Monster("Poring", 20, 2);
		}
		else if(name.equals("Bigfoot")){
			return new Monster("Bigfoot", 40, 15);
		}
		else if(name.equals("Phen")){
			return new Monster("Phen", 60, 40);
		}
		return null;
	}
}
