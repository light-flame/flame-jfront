package io.lightflame.jfront.component;

import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.selector.Selector;

import java.util.List;

public interface BodyElement {
    List<Selector> getSelectors();
    BodyElement selectors(Selector... selectors);
    BodyElement events(Event... evs);
    List<Event> getEvents();
}
