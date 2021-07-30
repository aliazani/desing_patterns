package Structural.Composite.Solution;

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
    public void move(int x, int y) {
        System.out.println(MessageFormat.format("Moving shape {0} to ({1}, {2}) coordination!", name, x, y));
    }
}
