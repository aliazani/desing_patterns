package Structural.Adaptor.Adaptor2.Challenge;

import java.text.MessageFormat;

public class vlcPlayer implements AdvancedMediaPlayer {
    private String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println(MessageFormat.format("Vlc is playing Filename: {0}", filename));
    }
}
