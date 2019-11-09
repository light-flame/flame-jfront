package io.lightflame.jfront.behavior;

import io.lightflame.jfront.selector.Selector;

public class AlertBehavior implements Behavior {

    private String msg;
    private Selector selector = new Selector();

    public AlertBehavior(String msg) {
        this.msg = msg;
    }

    @Override
    public Selector select() {
        return selector;
    }

    public String mensagem() {
        return msg;
    }
}
