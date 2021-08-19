package Behavioral.Strategy.Solution;

import java.text.MessageFormat;

public class PNGCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println(MessageFormat.format("Compressing using PNG {0}", fileName));
    }
}
