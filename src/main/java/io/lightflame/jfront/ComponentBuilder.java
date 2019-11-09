package io.lightflame.jfront;

import io.lightflame.jfront.component.BodyComponent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComponentBuilder {

  private List<BodyComponent> bodyComponents = new ArrayList<>();

  public ComponentBuilder(BodyComponent... bcs) {
    bodyComponents.addAll(Arrays.asList(bcs));
  }


  public List<BodyComponent> getBodyComponents() {
    return bodyComponents;
  }
}
