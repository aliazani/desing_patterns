package Structural.Adaptor.Adaptor2.Example1;

public class WildTurkey implements Turkey {
    @Override
    public void fly() {
        System.out.println("Wild turkey is flying.");
    }

    @Override
    public void gobble() {
        System.out.println("Wild turkey is gobbling.");
    }
}
