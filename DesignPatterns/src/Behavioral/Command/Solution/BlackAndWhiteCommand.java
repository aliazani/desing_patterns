package Behavioral.Command.Solution;

import Behavioral.Command.Solution.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Apply Black and White Filter.");
    }
}
