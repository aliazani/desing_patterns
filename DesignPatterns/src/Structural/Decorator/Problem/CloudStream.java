package Structural.Decorator.Problem;

import java.text.MessageFormat;

public class CloudStream {
    public void write(String data) {
        System.out.println(MessageFormat.format("Storing: {0}", data));
    }
}
