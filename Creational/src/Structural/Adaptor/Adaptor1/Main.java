package Structural.Adaptor.Adaptor1;

import Structural.Adaptor.Adaptor1.AvaFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        // Composition
        imageView.apply(new CaramelAdaptor(new Caramel()));
        // Inheritance
        imageView.apply(new CaramelAdaptor2());
    }
}
