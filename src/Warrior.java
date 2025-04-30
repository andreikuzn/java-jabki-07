public class Warrior extends Character {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Мечом в лицо!");
    }

    public void block(int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException("Урон для блока не может быть отрицательным.");
        }
        int reducedDamage = damage / 2;
        takeDamage(reducedDamage);
        System.out.printf("%s блокирует часть урона! Урон после блока: %s", getName(), reducedDamage);
    }
}
