package Structural.Bridge.Solution;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    void setChannel(int number) {
        device.setChannel(number);
    }
}
