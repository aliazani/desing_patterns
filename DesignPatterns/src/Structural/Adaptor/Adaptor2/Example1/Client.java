package Structural.Adaptor.Adaptor2.Example1;

public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();

        Turkey turkey = new WildTurkey();
        turkey.fly();
        turkey.gobble();

        TurkeyAdaptor turkeyAdaptor = new TurkeyAdaptor(turkey);
        turkeyAdaptor.fly();
        turkeyAdaptor.quack();
    }
}
