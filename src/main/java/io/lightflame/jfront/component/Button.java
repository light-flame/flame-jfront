package io.lightflame.jfront.component;

import io.lightflame.jfront.selector.HasSelectors;
import io.lightflame.jfront.selector.Selectables;
import io.lightflame.jfront.selector.Selector;

import java.util.*;

public class Button implements BodyElement, HasSelectors {


    private List<Selector> selectors = new ArrayList<>();

    @Override
    public List<Selector> getSelectors() {
        return selectors;
    }

    @Override
    public Button selectors(Selectables... selectable) {
        for (Selectables s : selectable){
            this.selectors.add(s.select());
        }
        return this;
    }

    @Override
    public String transpile() {
        return String.format("<button></button>");
    }
}
