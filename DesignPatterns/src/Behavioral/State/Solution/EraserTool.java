package Behavioral.State.Solution;

public class EraserTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }

    @Override
    public void mouseDown() {
        System.out.println("Eraser icon");
    }
}
