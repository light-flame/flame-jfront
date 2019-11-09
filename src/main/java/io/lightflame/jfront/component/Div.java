package io.lightflame.jfront.component;

import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.event.EventKind;
import io.lightflame.jfront.selector.Selector;

import java.util.*;

public class Div implements BodyComponent {

    private String id;
    private String name;
    private List<BodyComponent> content = new ArrayList<>();
    private Map<EventKind, Event> eventMap = new HashMap<>();
    private Selector selector;

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

    public Div addSelector(Selector s){
        this.selector = s;
        return this;
    }

    @Override
    public Div addEvent(Event event) {
        eventMap.put(event.kind(), event);
        return this;
    }

    public BodyComponent setName(String selectorName) {
        this.name = name;
        return this;
    }

    public BodyComponent setId(String selectorId) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Selector getSelector() {
        return selector;
    }

    public List<BodyComponent> getContent() {
        return content;
    }
}
