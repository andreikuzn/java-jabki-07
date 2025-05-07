public class Drone extends Vehicle {
    public Drone(int maxSpeed, int cargoCapacity) {
        super(maxSpeed, cargoCapacity);
    }

    @Override
    public String deliver(String destination) {
        return "Дрон взлетел. " + super.deliver(destination);
    }
}
