package src.com.example.video;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        Decoder dec = new Decoder();
        FilterEngine fe = new FilterEngine();
        Encoder enc = new Encoder();
        VideoPipelineFacade v=new VideoPipelineFacade(dec,fe,enc);
        Path src=Path.of("in.mp4");
        Path out= Path.of("out.mp4");
        Path result=v.process(src, out, true, 0.5, 1);
         System.out.println("Wrote " + result);
        
    }
}
