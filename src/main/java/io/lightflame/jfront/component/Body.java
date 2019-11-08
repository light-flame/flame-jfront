package io.lightflame.jfront.component;

import io.lightflame.jfront.ComponentBuilder;
import io.lightflame.jfront.selector.Selectors;

import java.util.ArrayList;
import java.util.List;

public class Body {

    private Selectors selectors = new Selectors();
    List<BodyComponent> bodyComponents = new ArrayList<>();

    public Body setComponents(ComponentBuilder builder){
        bodyComponents = builder.getBodyComponents();
        return this;
    }
}
