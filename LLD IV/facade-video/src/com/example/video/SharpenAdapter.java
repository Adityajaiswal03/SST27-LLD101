package src.com.example.video;

import java.util.Arrays;

public class SharpenAdapter {
    LegacySharpen ls;
    SharpenAdapter(LegacySharpen ls){
        this.ls=ls;
    }
        // Adapts LegacySharpen to work with Frame[]
        public Frame[] sharpen(Frame[] frames, int strength) {
            String handle = "FRAMES:" + frames.length;
            String resultHandle = ls.applySharpen(handle, strength);
            return Arrays.copyOf(frames, frames.length);
        }
}
