public class Car implements Vehicle{
    private int speed;

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

}
