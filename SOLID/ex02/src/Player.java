public class Player {
    private Frame last;
    public Player(Frame last) {
        this.last = last; // no frame cached
    }
    void play(){
        // decode
        // draw UI
        System.out.println("\u25B6 Playing " + last.getSize() + " bytes");
        // cache
        System.out.println("Cached last frame? " + (last!=null));
    }
}