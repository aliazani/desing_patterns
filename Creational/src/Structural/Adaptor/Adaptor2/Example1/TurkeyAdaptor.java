package Structural.Adaptor.Adaptor2.Example1;

public class TurkeyAdaptor implements Duck {
    private Turkey turkey;

    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Turkey flying short distance.");
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
