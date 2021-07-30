package Structural.Adapter.Solution;

public class VividFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("Vivid Filter is applying!");
    }
}
