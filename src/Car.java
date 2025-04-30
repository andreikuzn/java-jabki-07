public class Car extends VehicleBase {

    private String model;

    public Car(String brand, String model) {
        // вызывает конструктор суперкласса
        super(brand);
        this.model = model;
        System.out.println("Заврешение работы конструктора Car");
    }

    @Override
    public void startEngine() {
        // вызов метода суперкласса
        super.startEngine();
        System.out.printf("Проверка ремней безопасности %s\n", model);
    }
}
