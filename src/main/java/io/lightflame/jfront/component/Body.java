package io.lightflame.jfront.component;

import io.lightflame.jfront.ComponentBuilder;

import java.util.ArrayList;
import java.util.List;

public class Body {

    List<BodyComponent> bodyComponents = new ArrayList<>();

    public Body(ComponentBuilder builder){
        bodyComponents = builder.getBodyComponents();
    }

    public List<BodyComponent> getBodyComponents() {
        return bodyComponents;
    }
}
