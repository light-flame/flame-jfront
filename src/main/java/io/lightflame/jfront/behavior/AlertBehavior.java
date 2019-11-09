package io.lightflame.jfront.behavior;

import io.lightflame.jfront.selector.Selector;

public class AlertBehavior implements Behavior {

    private Selector selector = new Selector();
    @Override
    public Selector select() {
        return selector;
    }
}
