package io.lightflame.jfront.component;

import io.lightflame.jfront.event.Event;
import io.lightflame.jfront.selector.Selectables;
import io.lightflame.jfront.selector.Selector;

import java.util.*;

public class H1 implements BodyElement {


  private List<Selector> selectors = new ArrayList<>();

  @Override
  public List<Selector> getSelectors() {
    return selectors;
  }

  @Override
  public H1 selectors(Selectables... selectable) {
    for (Selectables s : selectable){
      this.selectors.add(s.select());
    }
    return this;
  }
}
