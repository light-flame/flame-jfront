package io.lightflame.jfront.style;

public class Display implements StyleProperties {
    @Override
    public String transpile() {
        return null;
    }

    public enum Kind {
        BLOCK, NONE
    }

    private Kind displayKind;

    public Display(Kind kind) {
        this.displayKind = kind;
    }

    public Kind getDisplayKind() {
        return displayKind;
    }
}
