package Structural.Adapter.Solution;

import Structural.Adapter.Solution.AvaFilters.Caramel;

public class Client {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        // Composition
        imageView.apply(new CaramelAdaptor(new Caramel()));
        // Inheritance
        imageView.apply(new CaramelAdaptor2());
    }
}
