public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Рычание!");
    }

    public void hunt() {
        System.out.println("Охота на антилопу");
    }
}
