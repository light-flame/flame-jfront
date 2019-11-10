package io.lightflame.jfront.js;

import io.lightflame.jfront.component.BodyElement;

public class JQueryBuilder {

    public JQueryBuilder(){
    }

    public JQuerySetter select(BodyElement... bodyElements){
        return new JQuerySetter();
    }

    public JQuerySetter select(Class<BodyElement>... classes){
        return new JQuerySetter();
    }

}
