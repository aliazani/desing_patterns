package Creational.Builder;

public class Director {

    public void construct(BuilderInterface builder) {
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
    }

}
