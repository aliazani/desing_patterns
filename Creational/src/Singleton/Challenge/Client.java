package Singleton.Challenge;

public class Client {
    public static void main(String[] args) {
        System.out.println("Trying to elect a captain for team:");
        var captain1 = CaptainSingleton.getCaptain();
        var captain2 = CaptainSingleton.getCaptain();
        System.out.println("Only One captain: " + (captain1 == captain2));
    }
}
