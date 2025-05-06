public class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя персонажа не может быть пустым.");
        }
        if (health <= 0) {
            throw new IllegalArgumentException("Здоровье должно быть больше нуля.");
        }
        this.name = name;
        this.health = health;
    }

    public void attack() {
        System.out.println("Атакую!");
    }

    public void takeDamage(int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException("Урон не может быть отрицательным.");
        }
        health -= damage;
        if (health < 0) health = 0;
        System.out.printf("%s получил урон: %s. Здоровье: %s\n", name, damage, health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException("Здоровье не может быть отрицательным.");
        }
        this.health = health;
    }
}