package Structural.Proxy.Solution;

import java.text.MessageFormat;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    private void load() {
        System.out.println(MessageFormat.format("Loading the e-book {0}", fileName));
    }

    @Override
    public void show() {
        System.out.println(MessageFormat.format("Showing the e-book {0}", fileName));
    }
}
