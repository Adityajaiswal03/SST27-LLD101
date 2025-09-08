package com.example.render;

public class Glyph {
    // Smell: style stored per instance → not memory efficient
    private final char ch;
    TextStyle ts;

    public Glyph(char ch, TextStyle ts) {
        this.ch = ch; 
        this.ts=ts;
    }

    public int drawCost() { return ts.getSize() + (this.isBold() ? 10 : 0); }
    public char getCh() { return ch; }
    public String getFont() { return ts.getFont(); }
    public int getSize() { return ts.getSize(); }
    public boolean isBold() { return ts.isBold(); }
}
