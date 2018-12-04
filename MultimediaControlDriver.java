/* Juan Ariza
 * COP 3003 Fall 2018
 * JP Project
 *
 * This project is based on the "OraclProduction" sample project
 * Each file and its contents are specified by the project requirements
 *
 * File: MultimediaControlDriver.java
 * Purpose: creates a driver class for MultimediaControl methodology
 *
 * Copyright © 2015, Oracle
 */

package sample;

import static sample.MonitorType.LCD;

public class MultimediaControlDriver implements MultimediaControl {

    public static void main(String[] args) {
        AudioPlayer audioPlay = new AudioPlayer("Generic", "Generic");
        MoviePlayer moviePlay = new MoviePlayer("Generic", new Screen("Generic", 0, 0), LCD);
        audioPlay.play();
        moviePlay.play();
        MultimediaControlDriver MultiPlay = new MultimediaControlDriver();
        MultiPlay.play();
    }


    // methods inherited from Multimedia control
    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void previous() {

    }

    @Override
    public void next() {

    }
}
