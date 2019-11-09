package io.lightflame.jfront.style;

public class Display implements StyleProperties {
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
