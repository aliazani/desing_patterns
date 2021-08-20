package Behavioral.Command.Solution;

import Behavioral.Command.Solution.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize.");
    }
}
