package Structural.Bridge;

import java.text.MessageFormat;

public class SamsungTv implements Device {
    @Override
    public void turnOn() {
        System.out.println("Samsung: TurnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: TurnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println(MessageFormat.format("Samsung: set channel {0}", number));
    }
}
