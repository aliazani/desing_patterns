package Structural.Decorator.Solution;

import java.text.MessageFormat;

public class CloudStream implements Stream {
    @Override
    public void write(String data) {
        System.out.println(MessageFormat.format("Storing: {0}", data));
    }
}
