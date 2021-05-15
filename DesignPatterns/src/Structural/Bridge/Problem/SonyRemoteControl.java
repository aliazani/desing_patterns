package Structural.Bridge.Problem;

public class SonyRemoteControl extends RemoteControl{

    @Override
    void turnOn() {
        System.out.println("Sony: TurnOn");
    }

    @Override
    void turnOff() {
        System.out.println("Sony: TurnOff");
    }
}
