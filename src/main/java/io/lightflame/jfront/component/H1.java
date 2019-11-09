package io.lightflame.jfront.component;

import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.selector.Selector;

import java.util.*;

public class H1 implements BodyElement {


  private List<Event> events = new ArrayList<>();

  @Override
  public H1 events(Event... evs) {
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
  public H1 selectors(Selector... selectors) {
    this.selectors = Arrays.asList(selectors);
    return this;
  }
}
