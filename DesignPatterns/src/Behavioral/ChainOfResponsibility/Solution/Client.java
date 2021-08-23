package Behavioral.ChainOfResponsibility.Solution;

public class Client {
    public static void main(String[] args) {
        // authenticator -> logger -> compressor
        var encryptor1 = new Encryptor(null);
        var compressor1 = new Compressor(encryptor1);
        var logger1 = new Logger(compressor1);
        var authenticator1 = new Authenticator(logger1);
        var server1 = new Webserver(authenticator1);

        server1.handle(new HttpRequest("admin", "1234"));
        System.out.println();
        server1.handle(new HttpRequest("user", "1234"));


        System.out.println();
        var logger2 = new Logger(null);
        var authenticator2 = new Authenticator(logger2);
        var server2 = new Webserver(authenticator2);
        server2.handle(new HttpRequest("admin", "1234"));
    }
}
