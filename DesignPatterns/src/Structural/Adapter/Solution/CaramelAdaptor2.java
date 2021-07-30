package Structural.Adapter.Solution;

import Structural.Adapter.Solution.AvaFilters.Caramel;
// Inheritance
public class CaramelAdaptor2 extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
