public class Mage extends Character {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Маг атакует - Огненный шар!");
    }

    public void heal() {
        int amount = 20;
        setHealth(getHealth() + amount);
        System.out.printf("%s лечит себя на %s. Здоровье: %s\n", getName(), amount, getHealth());
    }
}
