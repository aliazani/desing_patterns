package Structural.Adaptor.Adaptor2.Challenge;

public class MediaPlayerAdaptor implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdaptor(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String format, String filename) {
        advancedMediaPlayer.loadFilename(filename);
        advancedMediaPlayer.listen();
    }
}
