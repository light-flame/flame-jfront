package io.lightflame.jfront.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ToFile {

    static public void make(String fileName, String content){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);
            writer.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
