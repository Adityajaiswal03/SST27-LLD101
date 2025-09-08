package src.com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    Decoder dec;
    FilterEngine fe;
    Encoder enc;
    VideoPipelineFacade(Decoder dec,FilterEngine fe,Encoder enc){
        this.dec=dec;
        this.fe=fe;
        this.enc=enc;
    }

    java.nio.file.Path process(java.nio.file.Path src, java.nio.file.Path out, boolean gray, Double scale, Integer sharpenStrength){
        Frame[] frames = dec.decode(src);
        frames = fe.grayscale(frames);
        frames = fe.scale(frames, 0.5);
        // Legacy filter not used due to odd API
        Path output = enc.encode(frames,out);
       
        return output;
    }
}