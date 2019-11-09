package io.lightflame.jfront;

import io.lightflame.jfront.component.BodyElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComponentBuilder {

  private List<BodyElement> bodyComponents = new ArrayList<>();

  public ComponentBuilder(BodyElement... bcs) {
    bodyComponents.addAll(Arrays.asList(bcs));
  }


  public List<BodyElement> getBodyComponents() {
    return bodyComponents;
  }
}
