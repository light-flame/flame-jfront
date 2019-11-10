package io.lightflame.jfront.component;

import io.lightflame.jfront.Transpilable;

public class Header implements Transpilable {
    private String jquery = "https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js";

    public Header() {
    }


    @Override
    public String transpile() {
        String jqueryV = String.format("<script src=\"%s\"></script>", jquery);
        return null;
    }
}
