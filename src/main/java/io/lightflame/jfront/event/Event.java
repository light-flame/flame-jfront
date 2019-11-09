package io.lightflame.jfront.event;


import io.lightflame.jfront.behavior.Behavior;
import io.lightflame.jfront.component.BodyElement;
import io.lightflame.jfront.selector.Selectables;
import io.lightflame.jfront.selector.Selector;

import java.util.List;

public interface Event extends Selectables {
    Event behaviors(Behavior... behaviors);
    List<Behavior> getBehaviors();
}
