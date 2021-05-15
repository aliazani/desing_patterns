package Creational.AbstractFactory.Challenge;

public class HollywoodActionMovie implements HollywoodMovie {
    @Override
    public void getMovieName() {
        System.out.println("inside HollywoodActionMovie::getMovieName() method");
    }
}
