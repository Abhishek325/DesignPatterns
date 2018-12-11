//Concrete class implementing AdvancedMediaPlayer interface
package AdapterPattern;
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        System.out.println("Hope you enjoy listenging to " + fileName + " song in VLC player");
    }
    
    @Override
    public void playMp4(String fileName) {}
}
