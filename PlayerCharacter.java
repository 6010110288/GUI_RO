import java.util.*;

import javax.swing.Icon;

public class PlayerCharacter extends CharacterCreator {
    protected int experience;
    protected int levelUpExperiences;
	protected int level;
    protected int manaPoint;
    protected String job;
    protected String icon;

	protected final int maxLevel;
	public PlayerCharacter(String name){
		super(name);
        icon = "";
		experience = 0;
		level = 1;
		healthPoint = 30;
		// manaPoint = 15;

		maxLevel = 30;
		maxHealthPoint = 30;
		// maxManaPoint = 15;
		
		attackPoint = 5;
        // defensePoint = 5;
        // magicAttactPoint = 5;
        // dodgePoint = 5;
        job = "";
    }


    public int getAttackPoint(){
        return attackPoint;
    }

    public String getJob(){
        return job;
    }

	public int getExperience(){
		return experience;
	}
	
	public int getLevel(){
		return level;
    }
    
    public String getIcon(){
        return icon;
    }

    public int getHealthPoint(){
        return healthPoint;
    }

    public int getMaxHealthPoint(){
        return maxHealthPoint;
    }


	public void levelUp(){
        levelUpExperiences = (10 + getLevel())*getLevel();
		if(experience >= levelUpExperiences){
            level += 1;
            experience -= levelUpExperiences;
        }
	}

	public void gianExperience(int experience){
		this.experience += experience;
		levelUp();
    }
    public void regentHealthPoint(){
        if(healthPoint < maxHealthPoint-2)
            healthPoint += 2 ;
        else
            healthPoint = maxHealthPoint;
    }

    public int getLevelUpExperiences(){
        levelUp();
        return levelUpExperiences;
    }

}

