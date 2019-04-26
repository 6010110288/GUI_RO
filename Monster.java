import java.util.ArrayList;

public class Monster extends CharacterCreator {
	public Monster(String name, int healthPoint, int attackPoint) {
		super(name);
		this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
    }
}
