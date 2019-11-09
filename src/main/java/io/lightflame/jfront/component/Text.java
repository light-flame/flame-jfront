package io.lightflame.jfront.component;


import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.selector.Selectables;
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

  private List<Selector> selectors = new ArrayList<>();

  @Override
  public List<Selector> getSelectors() {
    return selectors;
  }

  @Override
  public Text selectors(Selectables... selectable) {
    for (Selectables s : selectable){
      this.selectors.add(s.select());
    }
    return this;
  }

}
