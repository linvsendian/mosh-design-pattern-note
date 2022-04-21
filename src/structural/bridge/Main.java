package structural.bridge;

public class Main {
    public static void main(String[] args) {
        AdvancedRemoteControl remoteControl = new AdvancedRemoteControl(new SonyTV());
        remoteControl.turnOn();
        remoteControl.setChannel(1);
        remoteControl.turnOff();

    }
}
