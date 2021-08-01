package Structural.Facade.Problem;

public class Client {
    public static void main(String[] args) {
        var server = new NotificationServer();
        var connection = server.connect("0.0.0.0");
        var authToken = server.authenticate("12", "Key");
        var message = new Message("Hello World!");
        server.send(authToken, message, "Target User/Device");
        connection.disconnect();
    }
}
