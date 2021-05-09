package Structural.Adaptor.Adaptor1.Implementation;

import Structural.Adaptor.Adaptor1.Implementation.AvaFilters.Caramel;

public class CaramelAdaptor2 extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
