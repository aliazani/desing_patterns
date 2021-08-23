package Behavioral.ChainOfResponsibility.Solution;


public class Webserver {
    private final Handler handler;

    public Webserver(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request) {
        handler.handle(request);
    }
}
