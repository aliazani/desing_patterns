package Structural.Adapter.Solution;

import Structural.Adapter.Solution.AvaFilters.Caramel;
// Aggregation(Composition)
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
