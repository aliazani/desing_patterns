package Structural.Adaptor.Adaptor1.Implementation;

import Structural.Adaptor.Adaptor1.Implementation.AvaFilters.Caramel;

public class CaramelAdaptor implements Filter {
    private Caramel caramel;

    public CaramelAdaptor(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
