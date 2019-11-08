package io.lightflame.jfront.event;

import io.lightflame.jfront.behavior.Behavior;

public interface Event {
  Event addBehavior(Behavior behavior);
  EventKind kind();
}
