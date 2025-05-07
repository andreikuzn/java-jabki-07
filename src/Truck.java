public class Truck extends Vehicle {
    public Truck(int maxSpeed, int cargoCapacity) {
        super(maxSpeed, cargoCapacity);
    }

    @Override
    public String deliver(String destination) {
        return "Грузовик загружен. " + super.deliver(destination);
    }
}