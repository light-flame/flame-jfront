package io.lightflame.jfront.component;

import io.lightflame.jfront.ComponentBuilder;

import java.util.ArrayList;
import java.util.List;

public class Body {

    List<BodyElement> bodyComponents = new ArrayList<>();

    public Body(ComponentBuilder builder){
        bodyComponents = builder.getBodyComponents();
    }

    public List<BodyElement> getBodyComponents() {
        return bodyComponents;
    }
}
