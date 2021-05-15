package Creational.Singleton.DoubleCheckLocking;
// This implementation is thread safe and solve performance issue

public class Singleton {
    private volatile static Singleton uniqueInstance = null;
    private int data;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null)
            synchronized (Singleton.class) {
                if (uniqueInstance == null)
                    uniqueInstance = new Singleton();
            }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
