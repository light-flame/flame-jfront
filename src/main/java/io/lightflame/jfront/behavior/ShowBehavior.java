package io.lightflame.jfront.behavior;

import io.lightflame.jfront.selector.Selectables;
import io.lightflame.jfront.selector.Selector;

public class ShowBehavior implements Behavior {

  private Selector selector;

  public ShowBehavior() {
    this.selector = new Selector();
  }

  @Override
  public Selector select() {
    return selector;
  }
}
