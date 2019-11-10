package io.lightflame.jfront.selector;

import io.lightflame.jfront.component.BodyElement;

import java.util.List;

public interface HasSelectors {
    List<Selector> getSelectors();
    BodyElement selectors(Selectables... selectables);
}
