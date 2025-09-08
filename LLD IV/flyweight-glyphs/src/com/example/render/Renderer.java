package com.example.render;


public class Renderer {
    public int render(String text) {
        int cost = 0;
        TextStyleFactory tsf = new TextStyleFactory();
        for (char c : text.toCharArray()) {
            if(tsf.getTextStyle(c)==null){
                TextStyle ts=new TextStyle("Inter", 14, (c % 7 == 0));
                tsf.map.put(c,ts);
            }
            Glyph g = new Glyph(c, tsf.getTextStyle(c)); // TODO: refactor with TextStyle flyweights
            cost += g.drawCost();

        }
        return cost;
    }
}
