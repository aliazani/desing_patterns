package Creational.Singleton.EagerEvaluation;
// This implementation is thread safe and solve performance issue

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();
    private int data;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
