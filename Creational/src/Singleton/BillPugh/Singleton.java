package Singleton.BillPugh;

public class Singleton {
    private int data;

    private Singleton() {
    }

    private static class SingletonHelper {
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
