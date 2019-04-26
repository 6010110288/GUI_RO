import java.util.*;

import javax.swing.Icon;

public class Novice extends PlayerCharacter {
    public Novice(String name){
        super(name);
        job = "Novice";
        icon = "./Image/NoviceIcon.png";
    }
    
    public String getIcon(){
        return icon;
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

    public int getAttackPoint(){
        return attackPoint;
    }

    public int getHealthPoint(){
        return healthPoint;
    }

    public int getMaxHealthPoint(){
        return maxHealthPoint;
    }

	public void levelUp(){
        levelUpExperiences = (10 + getLevel())*getLevel();
        if(level < maxLevel){
		    if(experience >= levelUpExperiences){
                level += 1;
                maxHealthPoint += 100*level/10;
                healthPoint = maxHealthPoint;
                experience -= levelUpExperiences;
                attackPoint += 3;
            }
        }
        else{
            experience = 0;
            levelUpExperiences = 0;
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