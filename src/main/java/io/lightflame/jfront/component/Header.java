package io.lightflame.jfront.component;

import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.selector.Selectables;
import io.lightflame.jfront.style.Style;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Header {
    private String jquery = "https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js";
    private List<Style> styles;
    private List<Event> events;

    public Header() {
    }

    public Header styles(Style... styles){
        this.styles = Arrays.asList(styles);
        return this;
    }

    public Header events(Event... events){
        this.events = Arrays.asList(events);
        return this;
    }

    public String getJquery() {
        return jquery;
    }

    public List<Style> getStyles() {
        return styles;
    }

    public List<Event> getEvents() {
        return events;
    }
}
