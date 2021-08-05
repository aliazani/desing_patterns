package Structural.Proxy.Solution;

public class Client {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "a", "b", "c"};
        for (var fileName : fileNames)
//            library.add(new EbookProxy(fileName));
            library.add(new LoggingEbookProxy(fileName));

        library.openEbook("a");
    }
}
