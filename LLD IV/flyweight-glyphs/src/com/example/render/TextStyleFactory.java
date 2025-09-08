package com.example.render;
public class TextStyleFactory {
    private final String font;
    private final int size;
    private final boolean bold;
    TextStyleFactory(String font,int size,boolean bold){
        this.font=font;
        this.size=size;
        this.bold=bold;
    }
    String getFont(){
        return this.font;
    }
    int getSize(){
        return this.size;
    }
    boolean isBold(){
        return this.bold;
    }
}
