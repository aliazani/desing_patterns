package Behavioral.Strategy.Solution;

import java.text.MessageFormat;

public class JPEGCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println(MessageFormat.format("Compressing using JPEG {0}", fileName));
    }
}
