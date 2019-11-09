package io.lightflame.jfront.event;

import io.lightflame.jfront.behavior.Behavior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnClick implements Event {

  List<Behavior> behaviors = new ArrayList<>();

  public OnClick(Behavior... bhs) {
    behaviors.addAll(Arrays.asList(bhs));
  }

  @Override
  public EventKind kind() {
    return EventKind.ON_CLICK;
  }
}
