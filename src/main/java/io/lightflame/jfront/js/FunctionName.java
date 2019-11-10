package io.lightflame.jfront.js;

import io.lightflame.jfront.selector.SelectorConfiguration;

public class FunctionName {

    private String genStr;

    public FunctionName() {
        genStr = String.format("function_%d", SelectorConfiguration.getCount());
    }

    public String getGenStr() {
        return genStr;
    }

}
