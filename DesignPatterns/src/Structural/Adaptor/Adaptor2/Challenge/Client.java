package Structural.Adaptor.Adaptor2.Challenge;

public class Client {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "taqdir.mp3");

        MediaPlayer mp4Player = new MediaPlayerAdaptor(new Mp4Player());
        mp4Player.play("mp4", "lordOfRings1.mp4");
    }
}
