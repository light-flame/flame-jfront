package io.lightflame.jfront.selector;

public class Selector {

    private String genStr;

    public Selector() {
        if (SelectorConfiguration.getPrefix() == null){
            SelectorConfiguration.generatePrefix(5);
        }
        genStr = String.format("%s_%d", SelectorConfiguration.getPrefix(), SelectorConfiguration.getCount());
    }

    public String getGenStr() {
        return genStr;
    }
}
