package Structural.Adaptor.Adaptor2.Challenge;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3"))
            System.out.println("Playing mp3 File using audio player.");
        else
            System.out.println("Invalid media " + audioType + " format is not supported!");
    }
}
