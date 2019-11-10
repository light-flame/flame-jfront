package io.lightflame.jfront.component;

import io.lightflame.jfront.Transpilable;
import io.lightflame.jfront.js.FunctionElement;

public class Script implements BodyElement, Transpilable {

    public Script(FunctionElement... functionElements){

    }

    @Override
    public String transpile() {
        return String.format("<script>%s</script>");
    }
}
