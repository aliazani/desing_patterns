package Structural.Facade.Problem;

import java.text.MessageFormat;

public class NotificationServer {
    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println(MessageFormat.format("Sending {0} To{1}", message, target));
    }

}
