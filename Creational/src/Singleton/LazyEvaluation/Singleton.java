package Singleton.LazyEvaluation;
// It's not thread safe (race condition)

public class Singleton {
    private static Singleton uniqueInstance = null;
    private int data;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
