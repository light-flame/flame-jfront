package io.lightflame.jfront.selector;

import java.util.Random;

public class SelectorConfiguration {
    static private long count = 0;
    static private String prefix;

    static public void setup(String p){
        prefix = p;
    }

    static String getPrefix() {
        return prefix;
    }

    public static long getCount() {
        count++;
        return count;
    }

    static void generatePrefix(int size){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int randomLimitedInt = leftLimit + (int)
                (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        prefix = buffer.toString();
    }
}
