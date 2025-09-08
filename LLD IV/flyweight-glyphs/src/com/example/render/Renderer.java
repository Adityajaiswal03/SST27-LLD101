package com.example.render;

import java.util.HashMap;

public class Renderer {
    public int render(String text) {
        int cost = 0;
        HashMap<Character, TextStyleFactory> map=new HashMap<>();
        for (char c : text.toCharArray()) {
            if(!map.containsKey(c)){
                TextStyleFactory ts=new TextStyleFactory("Inter", 14, (c % 7 == 0));
                map.put(c,ts);
            }
            Glyph g = new Glyph(c, map.get(c)); // TODO: refactor with TextStyle flyweights
            cost += g.drawCost();

        }
        return cost;
    }
}
