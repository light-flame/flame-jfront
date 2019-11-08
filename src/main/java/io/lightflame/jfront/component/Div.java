package io.lightflame.jfront.component;

import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.event.EventKind;
import io.lightflame.jfront.selector.Selector;
import io.lightflame.jfront.selector.Selectors;

import java.util.*;

public class Div implements BodyComponent, Selector {

    private List<BodyComponent> content = new ArrayList<>();
    private Map<EventKind, Event> eventMap = new HashMap<>();
    private Selectors selectors = new Selectors();

    public Div(String text) {
        this.content.add(new Text(text));
    }

    public Div(BodyComponent... components) {
        this.content = Arrays.asList(components);
    }

    public Div addText(Text text){
        this.content.add(text);
        return this;
    }

    @Override
    public Div addEvent(Event event) {
        eventMap.put(event.kind(), event);
        return this;
    }

    @Override
    public BodyComponent setName(String selectorName) {
        selectors.setName(selectorName);
        return this;
    }

    @Override
    public BodyComponent setId(String selectorId) {
        selectors.setId(selectorId);
        return this;
    }

}
