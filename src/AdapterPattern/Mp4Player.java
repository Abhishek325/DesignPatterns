//Concrete class implementing AdvacndeMediaPlayer interface
package AdapterPattern;
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("Hope you enjoy listenging to " + fileName + " song in mp4 player");
    }

    @Override
    public void playVlc(String fileName) {}
}
