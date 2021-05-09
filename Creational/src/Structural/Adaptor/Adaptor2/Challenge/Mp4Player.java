package Structural.Adaptor.Adaptor2.Challenge;

import java.text.MessageFormat;

public class Mp4Player implements AdvancedMediaPlayer {
    private String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println(MessageFormat.format("Mp4 is playing Filename: {0}", filename));
    }
}
