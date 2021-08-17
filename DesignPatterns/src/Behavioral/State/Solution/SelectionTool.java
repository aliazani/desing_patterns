package Behavioral.State.Solution;

public class SelectionTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Draw dashed rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }
}
