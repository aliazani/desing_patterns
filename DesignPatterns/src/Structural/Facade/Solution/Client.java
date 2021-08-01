package Structural.Facade;

public class Client {
    public static void main(String[] args) {
        var service = new NotificationService();
        service.sendMessage("Hello World!", "target");
    }
}
