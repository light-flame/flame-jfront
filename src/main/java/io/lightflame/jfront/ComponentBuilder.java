package io.lightflame.jfront;

import io.lightflame.jfront.component.BodyComponent;
import io.lightflame.jfront.component.Div;

import java.util.ArrayList;
import java.util.List;

public class ComponentBuilder {

  private List<BodyComponent> bodyComponents = new ArrayList<>();


  public ComponentBuilder addDiv(Div div){
    bodyComponents.add(div);
    return this;
  }

  public void setState(WebState state){

  }

  public BodyComponent selector(String selector){
    return null;
  }

  public List<BodyComponent> getBodyComponents() {
    return bodyComponents;
  }
}
