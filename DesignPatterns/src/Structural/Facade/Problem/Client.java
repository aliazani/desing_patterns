package Structural.Facade.Problem;

public class Client {
    public static void main(String[] args) {
        var server = new NotificationServer();
        var connection = server.connect("0.0.0.0");
        var authToken = server.authenticate("12", "key");
        var message = new Message("Hello world!");
        server.send(authToken, message, "target");
        connection.disconnect();
    }
}
