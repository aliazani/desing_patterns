package Structural.Bridge.Solution;

public class Client {
    public static void main(String[] args) {
        var control1 = new RemoteControl(new SonyTv());
        control1.turnOn();
        control1.turnOff();

        var advancedControl1 = new AdvancedRemoteControl(new SonyTv());
        advancedControl1.turnOn();
        advancedControl1.setChannel(2);

        var control2 = new RemoteControl(new SamsungTv());
       control2.turnOn();
        control2.turnOff();
    }
}
