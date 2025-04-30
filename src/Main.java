import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * Классы Animal & Dog
         * Наследование (extends)
         * Наследование — это механизм, при котором один класс может унаследовать свойства и методы другого класса.
         */
        Dog dog = new Dog();
        AnimalBase animal = new AnimalBase();

        /**
         * Классы Animal & Dog
         * Переопределение методов (@Override)
         * Переопределение — это написание своей версии метода, который уже есть в суперклассе.
         */
        dog.speak();
        animal.speak();

        /**
         * Классы Vehicle & Car
         * Ключевое слово super
         * Используется, чтобы:
         * - Вызвать конструктор суперкласса
         * - Вызвать метод родителя
         */
        Car car = new Car("Лада", "Нива");
        car.startEngine();

        /**
         * - Класс Car наследует Vehicle
         * - В конструкторе Car используется super(brand), чтобы вызвать конструктор Vehicle
         * - Метод startEngine() переопределён, но всё ещё вызывает оригинальный метод родителя
         * через super.startEngine() — это позволяет дополнить, а не заменить поведение
         */

        /**
         * Классы Shape & Circle & Rectangle
         * Полиморфизм (от греч. «много форм») — это способность одного "интерфейса" работать с объектами разных типов.
         *
         * Полиморфизм обычно проявляется через:
         * - наследование (extends)
         * - переопределение методов (@Override)
         * - использование ссылок суперкласса для объектов подклассов (super)
         */
        Shape[] shapes = { new Circle(), new Rectangle(), new Shape() };
        for (Shape s : shapes) {
            s.draw();
        }

        /**
         * Что даёт полиморфизм?
         * Гибкость: можно обрабатывать объекты по общему интерфейсу
         * Расширяемость: добавление новых подклассов — без изменения старого кода
         * Упрощение кода: меньше условий, меньше зависимостей
         *
         * Примеры из жизни:
         * - Мы используем клавиатуру, мышь, сканер для ввода информации (один метод read(..)), но везде своя реализация
         * - В комании работают разные люди и все получают зарплату, но реализация может отличаться (в продажах сделка, у разработчиков фикс)
         */

        /**
         * ДЗ7
         */

        // Банковские счета
        Account[] accounts = new Account[3];
        accounts[0] = new SavingsAccount("SA-001", 1500.0, 0.05);
        accounts[1] = new CreditAccount("CA-001", 500.0, 1000.00);
        accounts[2] = new SavingsAccount("SA-002", 800.0, 0.05);

        for (Account acc : accounts) {
            double depositAmount = 100.00;
            System.out.printf("Пополнение счета %s на %s единиц\n", acc.getAccountNumber(), depositAmount);
            acc.deposit(depositAmount);
        }

        for (Account acc : accounts) {
            acc.applyInterest();
            System.out.printf("Начисление процентов по счету %s, итоговый баланс %s единиц\n", acc.getAccountNumber(), acc.getBalance());
        }

        for (Account acc : accounts) {
            double withdrawAmount = 700.00;
            System.out.printf("Снятие %s со счета %s\n", withdrawAmount, acc.getAccountNumber());
            acc.withdraw(withdrawAmount);
            acc.displayInfo();
            System.out.println();
        }

        // Система доставки
        Vehicle truck = new Truck(120, 10000);
        Vehicle drone = new Drone(60, 50);
        DeliverySystem.startDelivery(truck, "Москва");
        DeliverySystem.startDelivery(drone, "Санкт-Петербург");

        // Зоопарк
        List<Animal> animalEnclosure = List.of(
                new Lion("Лев", 5),
                new Parrot("Попугай", 2),
                new Lion("Молодой лев", 3)
        );

        for (Animal animalFromEnclosure : animalEnclosure) {
            animalFromEnclosure.makeSound();
        }

        // Игровые персонажи
        Warrior warrior = new Warrior("Воин", 100);
        Mage mage = new Mage("Маг", 80);

        while (warrior.isAlive() && mage.isAlive()) {
            mage.attack();
            warrior.takeDamage(20);
            warrior.block(20);
            System.out.println();
            warrior.attack();
            mage.takeDamage(25);
            mage.heal(10);
            System.out.println("\n------------------------");
        }

        if (warrior.isAlive()) {
            System.out.println(warrior.getName() + " победил!");
        } else {
            System.out.println(mage.getName() + " победил!");
        }
    }
}
