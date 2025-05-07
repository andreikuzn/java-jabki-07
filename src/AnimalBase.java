public class AnimalBase {

    private String name = "Абстрактная живность";

    public void speak() {
        System.out.printf("Животное '%s' говорит вам БУУУ!\n", this.name);
    }
}
