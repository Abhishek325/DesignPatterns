//Concrete class that implements MediaPlayer
/*
This class contains the "adapter"(MediaAdapter) which makes it compatible with AdvancedMediaPlayer too!
*/
package AdapterPattern;
public class AudioPlayer implements MediaPlayer{
    MediaAdapter adpater;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3")){
            System.out.println("Playing " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            new MediaAdapter(audioType).play(audioType, fileName);
        }
        else{
            System.err.println("Can't play format type : " + audioType);
        }
    }
}
