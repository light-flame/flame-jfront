package io.lightflame.jfront.event;

import io.lightflame.jfront.behavior.Behavior;

public class OnClick implements Event {

  @Override
  public Event addBehavior(Behavior behavior) {
    return new OnClick();
  }

  @Override
  public EventKind kind() {
    return EventKind.ON_CLICK;
  }
}
