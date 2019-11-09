package io.lightflame.jfront.selector;

import java.nio.charset.Charset;
import java.util.Random;

public class Selector {

    private String genStr = "sel_";

    public Selector() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        this.genStr += buffer.toString();
    }

    public String getGenStr() {
        return genStr;
    }
}
