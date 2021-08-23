package Behavioral.ChainOfResponsibility.Problem;

public class Webserver {
    private void handle(HttpRequest request) {
       // Authentication
        var authenticator = new Authenticator();
        authenticator.authenticate(request);
       // Logging
        var logger = new Logger();
        logger.log(request);
       // Compression
        var compressor = new Compressor();
        compressor.compress(request);
       // ...
    }
}
