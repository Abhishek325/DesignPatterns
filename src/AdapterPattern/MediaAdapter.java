//Adapter class:
/*
1. This class implements MediaPlayer interface which makes it compatible for mp3 audioType
2. In order to provide compatibility for vlc/.mp4 audioType o.e. AdvancedMedia, it initialzies the AdvancedMediaPlayer object.
3. The advanced media player object invokes the corresponding player (VLC/Mp4) basied upon the audioType annd corresponding play();
*/
package AdapterPattern;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advMediaPlayer.playVlc(fileName);
        } else {
            advMediaPlayer.playMp4(fileName);
        }
    }

}
