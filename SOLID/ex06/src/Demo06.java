public class Demo06 {
    public static void main(String[] args) {
        Flyable sparrow = new Sparrow();
        new Aviary().release(sparrow);
        Bird Penguin = new Penguin();
        Penguin.chirp();

    }
}
