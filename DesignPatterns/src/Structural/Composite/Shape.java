package Structural.Composite;

import java.text.MessageFormat;

public class Shape implements Component {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println(MessageFormat.format("Rendering shape {0} !", name));
    }

    @Override
    public void move() {
        System.out.println(MessageFormat.format("Moving shape {0} !", name));
    }
}
