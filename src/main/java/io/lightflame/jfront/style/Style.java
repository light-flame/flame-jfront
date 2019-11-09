package io.lightflame.jfront.style;

import io.lightflame.jfront.selector.Selector;

public class Style {

    private Selector selector;
    private Display display;

    public Style(Selector selector){
        this.selector = selector;
    }


    public Selector getSelector() {
        return selector;
    }

    public Style display(Display display){
        this.display = display;
        return this;
    }

    public Display getDisplay() {
        return display;
    }
}
