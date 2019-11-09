package io.lightflame.jfront.component;

import io.lightflame.jfront.style.Style;

import java.util.List;

public class Header {
    private String jquery = "https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js";
    private List<Style> styles;

    public Header(List<Style> styles) {
        this.styles = styles;
    }

    public String getJquery() {
        return jquery;
    }

    public List<Style> getStyles() {
        return styles;
    }
}
