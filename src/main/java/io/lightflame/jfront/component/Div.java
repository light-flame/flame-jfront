package io.lightflame.jfront.component;


import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.selector.Selector;

import java.util.*;

public class Div implements BodyElement {

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

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    public List<BodyElement> getContent() {
        return content;
    }

    private List<Event> events = new ArrayList<>();

    @Override
    public Div events(Event... evs) {
        this.events = Arrays.asList(evs);
        return this;
    }

    @Override
    public List<Event> getEvents() {
        return events;
    }

    private List<Selector> selectors = new ArrayList<>();

    @Override
    public List<Selector> getSelectors() {
        return selectors;
    }

    @Override
    public Div selectors(Selector... selectors) {
        this.selectors = Arrays.asList(selectors);
        return this;
    }
}
