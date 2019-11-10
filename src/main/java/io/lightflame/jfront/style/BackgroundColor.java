package io.lightflame.jfront.style;

import io.lightflame.jfront.Transpilable;

public class BackgroundColor implements StyleProperties, Transpilable {
    private String color;

    public BackgroundColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String transpile() {
        return String.format("background-color: %s;", color);
    }
}
