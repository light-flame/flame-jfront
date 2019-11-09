package io.lightflame.jfront.style;

import io.lightflame.jfront.selector.Selectables;
import io.lightflame.jfront.selector.Selector;

public class Style implements Selectables {

    private Selector selector;
    private Display display;

    public Style(Selector selector){
        this.selector = selector;
    }

    public Style(){
        this.selector = new Selector();
    }

    @Override
    public Selector select() {
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
