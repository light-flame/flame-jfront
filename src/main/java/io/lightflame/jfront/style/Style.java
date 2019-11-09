package io.lightflame.jfront.style;

import io.lightflame.jfront.selector.Selectables;
import io.lightflame.jfront.selector.Selector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Style implements Selectables {

    private Selector selector;
    private List<StyleProperties> properties = new ArrayList<>();

    public Style(Selector selector){
        this.selector = selector;
    }

    public Style(StyleProperties... styleProperties){
        this.selector = new Selector();
        this.properties = Arrays.asList(styleProperties);
    }

    @Override
    public Selector select() {
        return selector;
    }

    public List<StyleProperties> getProperties() {
        return properties;
    }
}
