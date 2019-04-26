import java.util.*;

public class Swordman extends PlayerCharacter {
    public Swordman(String name){
        super(name);
        job = "Swordman";
        icon = "./Image/SwordmanIcon.png";
        level = 10;
        healthPoint = 600;
        maxHealthPoint = 600;
        attackPoint = 50;
    }



    public int getAttackPoint(){
        return attackPoint;
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
                experience -= levelUpExperiences;
                maxHealthPoint += 50*level;
                healthPoint = maxHealthPoint;
                attackPoint += 5;
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
        if(healthPoint < maxHealthPoint-20)
            healthPoint += 20 ;
        else
            healthPoint = maxHealthPoint;
    }

    public int getLevelUpExperiences(){
        levelUp();
        return levelUpExperiences;
    }
}