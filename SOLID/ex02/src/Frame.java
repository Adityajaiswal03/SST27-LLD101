public class Frame { 
    byte[] data; 
    Frame(byte[] d)
    { 
        this.data=d; 
    }
    public int getSize() {
        return data.length;
    }
}
