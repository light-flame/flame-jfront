package io.lightflame.jfront.event;

import io.lightflame.jfront.behavior.Behavior;
import io.lightflame.jfront.selector.Selectables;
import io.lightflame.jfront.selector.Selector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnClick implements Event {

  private Selector selector;
  private List<Behavior> behaviors = new ArrayList<>();


  public OnClick(Behavior... behaviors){
    this.behaviors.addAll(Arrays.asList(behaviors));
    this.selector = new Selector();
  }

  @Override
  public Selector select() {
    return selector;
  }

  @Override
  public List<Behavior> getBehaviors() {
    return behaviors;
  }
}
