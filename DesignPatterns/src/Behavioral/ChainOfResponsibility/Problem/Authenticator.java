package Behavioral.ChainOfResponsibility.Problem;

public class Authenticator {
    public boolean authenticate(HttpRequest request) {
        System.out.println("Authentication.");
        return (request.getUsername().equals("admin") &&
                request.getPassword().equals("1234"));

    }
}
