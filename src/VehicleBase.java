public class VehicleBase {

    private String brand;

    public VehicleBase(String brand) {
        this.brand = brand;

        System.out.println("Заврешение работы конструктора Vehicle");
    }

    public void startEngine() {
        System.out.printf("Запуск двигателя для %s\n", this.brand);
    }
}
