public class Warrior extends Character {
    private boolean isBlocking = false;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Воин атакует - Мечом в лицо!");
    }

    public void block() {
        isBlocking = true;
        System.out.printf("%s готовится блокировать следующий урон!\n", getName());
    }

    @Override
    public void takeDamage(int damage) {
        if (isBlocking) {
            int reducedDamage = damage / 2;
            System.out.printf("%s блокирует часть урона! Урон после блока: %s\n", getName(), reducedDamage);
            super.takeDamage(reducedDamage);
            isBlocking = false;
        } else {
            super.takeDamage(damage);
        }
    }
}
