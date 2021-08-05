package Structural.Proxy.Problem;

import java.text.MessageFormat;

public class Ebook {
    private String fileName;

    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    public String getFileName() {
        return fileName;
    }

    private void load() {
        System.out.println(MessageFormat.format("Loading the e-book {0}", fileName));
    }

    public void show() {
        System.out.println(MessageFormat.format("Showing the e-book {0}", fileName));
    }
}
