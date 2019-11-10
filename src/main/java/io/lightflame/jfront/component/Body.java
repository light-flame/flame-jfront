package io.lightflame.jfront.component;

import io.lightflame.jfront.Transpilable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Body implements Transpilable {

    List<BodyElement> bodyElements = new ArrayList<>();

    public Body(BodyElement... bcs) {
        bodyElements.addAll(Arrays.asList(bcs));
    }

    @Override
    public String transpile() {
        String result = "";
        for (BodyElement bodyElement : bodyElements){
            result += bodyElement.transpile();
        }
        return result;
    }
}
