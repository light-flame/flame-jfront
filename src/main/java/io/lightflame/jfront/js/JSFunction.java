package io.lightflame.jfront.js;

import java.util.Arrays;

public class JSFunction implements DeclareName, FunctionElement{

    private FunctionName functionName;
    private FunctionElement[] functionElements;


    public JSFunction() {
        this.functionName = new FunctionName();
    }

    public JSFunction add(FunctionElement... fe){
        this.functionElements = fe;
        return this;
    }

    @Override
    public FunctionName getName() {
        return functionName;
    }

    @Override
    public String transpile() {
        StringBuilder result = new StringBuilder();
        for (FunctionElement functionElement : Arrays.asList(functionElements)){
            result.append(functionElement.transpile());
        }
        return String.format("function %s() {%s}", getName().getGenStr(), result);
    }
}
