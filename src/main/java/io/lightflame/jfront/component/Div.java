package io.lightflame.jfront.component;

import io.lightflame.jfront.selector.HasSelectors;
import io.lightflame.jfront.selector.Selectables;
import io.lightflame.jfront.selector.Selector;

import java.util.*;

public class Div implements BodyElement, HasSelectors {

    private String id;
    private String name;
    private List<BodyElement> content = new ArrayList<>();

    public Div(String text) {
        this.content.add(new Text(text));
    }

    public Div(BodyElement... components) {
        this.content = Arrays.asList(components);
    }

    public Div addText(Text text){
        this.content.add(text);
        return this;
    }

    public BodyElement setName(String selectorName) {
        this.name = name;
        return this;
    }

    public BodyElement setId(String selectorId) {
        this.id = id;
        return this;
    }



    private List<Selector> selectors = new ArrayList<>();

    @Override
    public List<Selector> getSelectors() {
        return selectors;
    }

    @Override
    public Div selectors(Selectables... selectable) {
        for (Selectables s : selectable){
            this.selectors.add(s.select());
        }
        return this;
    }

    @Override
    public String transpile() {
        return String.format("<div></div>");
    }
}
