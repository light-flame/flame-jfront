package io.lightflame.jfront.selector;

import io.lightflame.jfront.component.BodyComponent;

public interface Selector {
  BodyComponent setName(String selectorName);
  BodyComponent setId(String selectorId);
}
