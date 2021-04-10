package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        var shapeFactory = FactoryProducer.getFactory("shape");
        shapeFactory.getShape("square").draw();
        shapeFactory.getShape("circle").draw();

        var colorFactory = FactoryProducer.getFactory("color");
        colorFactory.getColor("blue").fill();
        colorFactory.getColor("red").fill();
    }
}
