package AbstractFactory.Challenge;

public class BollywoodComedyMovie implements BollywoodMovie {
    @Override
    public void getMovieName() {
        System.out.println("inside BollywoodComedyMovie::getMovieName() method");
    }
}
