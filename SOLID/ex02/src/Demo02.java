public class Demo02 {
    public static void main(String[] args) {
        Frame lastFrame = new Frame(new byte[]{1,2,3,4});
        new Player(lastFrame).play();
    }
}
