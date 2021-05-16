package Structural.Composite.Problem;

public class Client {
    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape("Square")); // square
        group1.add(new Shape("Square")); // square

        var group2 = new Group();
        group2.add(new Shape("Circle")); // circle
        group2.add(new Shape("Circle")); // circle

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
    }
}
