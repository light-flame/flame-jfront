package io.lightflame.jfront.js;


public class JQuerySetter {
    public JQuerySetter next(){
        return this;
    }
    public JQuerySetter first(){
        return this;
    }

    public JqueryEvent click(JSFunction f){
        return new JqueryEvent();
    }

    public JqueryEvent show(String velocity, FunctionName fName){
        return new JqueryEvent();
    }
}
