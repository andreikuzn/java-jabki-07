public class Mage extends Character {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Маг атакует - Огненный шар!");
    }

    public void heal(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Количество лечащегося здоровья не может быть отрицательным.");
        }
        setHealth(getHealth() + amount);
        System.out.printf("%s лечит себя на %s. Здоровье: %s", getName(), amount, getHealth());
    }
}
