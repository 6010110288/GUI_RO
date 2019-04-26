import java.util.*;

public class RandomMoster{
    private Random random;
    private String name;

    public RandomMoster(){
        random = new Random();
    }

    public Monster getRandomMonster(){
        int index = (int)(Math.random() * 10);
        if(index <= MonsterList.monsterName.length-1)
	       name = MonsterList.monsterName[index];
        else
            name = "unknow";

        return MonsterList.generateMonster(name);
    }
}