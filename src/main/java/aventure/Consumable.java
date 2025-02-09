package aventure;

public class Consumable extends Item {
    private String effect;

    public Consumable(String name, double weight, String effect) {
        super(name, weight);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    public void use(Hero hero) {
        System.out.println("Utilisation de : " + name + " -> Effet : " + effect);
    }
}
