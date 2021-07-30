package Structural.Composite;

public class Client {
    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape("Square"));
        group1.add(new Shape("Square"));
        group1.render();

        var group2 = new Group();
        group2.add(new Shape("Circle"));
        group2.add(new Shape("Circle"));
        group2.render();

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
    }
}
