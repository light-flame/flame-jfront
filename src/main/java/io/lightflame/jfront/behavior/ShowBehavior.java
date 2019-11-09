package io.lightflame.jfront.behavior;

import io.lightflame.jfront.selector.Selectables;
import io.lightflame.jfront.selector.Selector;

public class ShowBehavior implements Behavior {

  private Selector selector;
  private int velocity;

  public ShowBehavior(int velocity) {
    this.selector = new Selector();
    this.velocity = velocity;
  }

  @Override
  public Selector select() {
    return selector;
  }

  public int getVelocity() {
    return velocity;
  }
}
