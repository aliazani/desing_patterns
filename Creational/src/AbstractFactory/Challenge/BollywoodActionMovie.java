package AbstractFactory.Challenge;

public class BollywoodActionMovie implements BollywoodMovie {
    @Override
    public void getMovieName() {
        System.out.println("inside BollywoodActionMovie::getMovieName() method");
    }
}
