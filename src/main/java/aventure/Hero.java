package aventure;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Person {
    private Inventory inventory;
    private List<String> skills;

    public Hero(int id, String name, int health) {
        super(id, name, health);
        this.inventory = new Inventory();
        this.skills = new ArrayList<>();
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void attack(Person enemy, int damage) {
        enemy.takeDamage(damage);
    }

    public Inventory getInventory() {
        return inventory;
    }
}
