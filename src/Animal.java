public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя животного не может быть пустым");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Возраст должен быть больше нуля");
        }
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Издает звук");
    }

    public void eat() {
        System.out.println(name + " ест");
    }
}
