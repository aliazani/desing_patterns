package Structural.Composite.Problem;

import java.text.MessageFormat;

public class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public void render() {
        System.out.println(MessageFormat.format("Rendering shape {0} !", name));
    }
}
