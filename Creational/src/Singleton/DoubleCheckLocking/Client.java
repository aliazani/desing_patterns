package Singleton.DoubleCheckLocking;

public class Client {
    public static void main(String[] args) {
        var s1 = Singleton.getInstance();
        s1.setData(10);
        System.out.println("First reference: " + s1);
        System.out.println("Singleton Data value: " + s1.getData());

        var s2 = Singleton.getInstance();
        s2.setData(20);
        System.out.println("First reference: " + s2);
        System.out.println("Singleton Data value: " + s2.getData());
    }
}
