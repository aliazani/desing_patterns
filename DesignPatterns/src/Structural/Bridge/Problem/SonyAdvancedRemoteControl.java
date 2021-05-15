package Structural.Bridge.Problem;

import java.text.MessageFormat;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl {
    @Override
    void setChannel(int number) {
        System.out.println(MessageFormat.format("Sony: set channel {0}", number));
    }

    @Override
    void turnOn() {
        System.out.println("Sony: TurnOn");
    }

    @Override
    void turnOff() {
        System.out.println("Sony: TurnOff");
    }
}
