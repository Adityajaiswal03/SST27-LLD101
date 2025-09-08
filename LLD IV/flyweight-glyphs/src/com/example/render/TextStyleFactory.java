package com.example.render;

import java.util.HashMap;

public class TextStyleFactory {
    HashMap<Character,TextStyle>map=new HashMap<>();
    public TextStyle getTextStyle(char key){
        return map.get(key);
    }
}
