package io.lightflame.jfront.component;


import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.selector.Selector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text implements BodyElement {

  private String text;

  public Text(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  private List<Event> events = new ArrayList<>();

  @Override
  public Text events(Event... evs) {
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
  public Text selectors(Selector... selectors) {
    this.selectors = Arrays.asList(selectors);
    return this;
  }
}
