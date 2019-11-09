package io.lightflame.jfront.style;

public class BackgroundColor implements StyleProperties {
    private String color;

    public BackgroundColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
