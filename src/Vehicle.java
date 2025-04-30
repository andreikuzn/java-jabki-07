public class Vehicle {
    private int maxSpeed;
    private int cargoCapacity;

    public Vehicle(int maxSpeed, int cargoCapacity) {
        if (maxSpeed <= 0) {
            throw new IllegalArgumentException("Скорость должна быть больше нуля");
        }
        if (cargoCapacity <= 0) {
            throw new IllegalArgumentException("Грузоподъёмность должна быть больше нуля");
        }
        this.maxSpeed = maxSpeed;
        this.cargoCapacity = cargoCapacity;
    }

    public String deliver(String destination) {
        if (destination == null || destination.isBlank()) {
            throw new IllegalArgumentException("Адрес доставки не может быть пустым");
        }
        return String.format("Доставка в г. %s. Максимальная скорость: %d км/ч, Грузоподъёмность: %d кг",
                destination, maxSpeed, cargoCapacity);
    }
}
