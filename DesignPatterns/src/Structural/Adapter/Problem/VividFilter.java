package Structural.Adapter.Problem;

public class VividFilter implements Filter {
    @Override
    public void apply(Image image) {
        System.out.println("Vivid Filter is applying!");
    }
}
