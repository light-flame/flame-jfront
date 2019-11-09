package io.lightflame.jfront.behavior;

import io.lightflame.jfront.selector.Selectables;
import io.lightflame.jfront.selector.Selector;

public interface Behavior extends Selectables {
    Selector select();
}
