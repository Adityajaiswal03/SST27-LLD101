public class Sparrow extends Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void chirp() {
        System.out.println("Sparrow is chirping");
    }
}
