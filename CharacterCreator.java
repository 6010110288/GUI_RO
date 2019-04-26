import java.util.*;

public class CharacterCreator{
    //character name
    private String name;
    //main status
    protected int healthPoint;
    // protected int manaPoint;
    
    protected int maxHealthPoint;
    // protected int maxManaPoint;
    //other status
    protected int attackPoint;
    // protected int defensePoint;
    // protected int magicAttactPoint;
    // protected int dodgePoint;

    public CharacterCreator(String name){
        this.name = name;
        healthPoint = 0;
        // manaPoint = 0;
        maxHealthPoint = 0;
        // maxManaPoint = 0;

        attackPoint = 0;
        // defensePoint = 0;
        // magicAttactPoint = 0;
        // dodgePoint = 0;
    }

    public String getName(){
        return name;
    }

    public int getAttackPoint(){
        return attackPoint;
    }

    public int getHealthPoint(){
        return healthPoint;
    }

    public int getMaxHealthPoint(){
        return maxHealthPoint;
    }

    public void attack(CharacterCreator enemy){
		enemy.damage(attackPoint);
	}

    public void damage(int attackPoint){
		this.healthPoint -= attackPoint;
		if(this.healthPoint < 0)
			this.healthPoint = 0;
    }	
    
    public boolean isDead(){
		if(healthPoint == 0)
			return true;
		return false;
	}
}