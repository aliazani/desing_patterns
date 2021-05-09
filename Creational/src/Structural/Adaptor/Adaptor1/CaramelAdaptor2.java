package Structural.Adaptor.Adaptor1;

import Structural.Adaptor.Adaptor1.AvaFilters.Caramel;

public class CaramelAdaptor2 extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
