package Structural.Facade.Solution;

public class NotificationService {
    public void sendMessage(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect("ipAddress");
        var authToken = server.authenticate("appId", "key");
        server.send(authToken, new Message(message), target);
        connection.disconnect();

    }
}
