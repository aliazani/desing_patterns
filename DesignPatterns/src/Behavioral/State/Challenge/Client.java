package Behavioral.State.Challenge;

public class Client {
    public static void main(String[] args) {
        var directionService = new DirectionService(new Driving());
        directionService.getEta();
        directionService.getDirection();

        directionService.setTravelMode(new Bicycling());
        directionService.getEta();
        directionService.getDirection();
    }
}
