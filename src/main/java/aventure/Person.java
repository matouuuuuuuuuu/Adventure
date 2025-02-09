package aventure;


public abstract class Person extends Entity {
    protected int health;

    public Person(int id, String name, int health) {
        super(id, name);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public void heal(int amount) {
        this.health += amount;
    }
}
