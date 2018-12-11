package AdapterPattern;
public class AdpaterPatternMain {
    public static void main(String[] args){
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "Song1.mp3");
        player.play("mp4", "Song2.mp4");
        player.play("vlc", "Song3.vlc");
        player.play("ogg", "Song.vlc");
    }
}
