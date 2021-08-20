package Behavioral.Command.Solution;

import Behavioral.Command.Solution.fx.Button;

public class Client {
    public static void main(String[] args) {
        // receiver
        var service = new CustomerService();
        // Concrete Command
        var command = new AddCustomerCommand(service);
        // invoker
        var button = new Button(command);

        button.click();

        var composite = new CompositeCommand();
        // Concrete Command
        composite.add(new ResizeCommand());
        // Concrete Command
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}
