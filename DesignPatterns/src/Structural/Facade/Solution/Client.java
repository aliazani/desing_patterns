package Structural.Facade.Solution;

public class Client {
    public static void main(String[] args) {
        var service = new NotificationService();
        service.sendMessage("Hello World!", "target");
    }
}
