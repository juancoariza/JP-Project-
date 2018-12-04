package sample;

import static sample.ItemType.AUDIO;

public class AudioPlayerDriver {

    /* main method for driver */

    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer("Generic", "Generic");
        System.out.println(ap);
        ap.play();
        ap.next();
        ap.previous();
        ap.stop();
    }
}

