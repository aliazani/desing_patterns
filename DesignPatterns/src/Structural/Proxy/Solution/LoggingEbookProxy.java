package Structural.Proxy.Solution;

import java.text.MessageFormat;

public class LoggingEbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null)
            ebook = new RealEbook(fileName);

        System.out.println(MessageFormat.format("Logging the e-book {0}", fileName));
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
