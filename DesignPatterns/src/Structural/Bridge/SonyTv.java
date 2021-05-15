package Structural.Bridge;

import java.text.MessageFormat;

public class SonyTv implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sony: TurnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: TurnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println(MessageFormat.format("Sony: set channel {0}", number));
    }
}
