/* Juan Ariza
 * COP 3003 Fall 2018
 * JP Project
 *
 * This project is based on the "OraclProduction" sample project
 * Each file and its contents are specified by the project requirements
 *
 * File: ScreenSpecDriver.Java
 * Purpose: creates driver class to test the Screen interface
 *
 * Copyright © 2015, Oracle
 */

package sample;

public class ScreenSpecDriver {

    public static void main(String[] args) {
        Screen screen1 = new Screen("Generic", 0, 0);
        //System.out.println(screen1);
        System.out.println(screen1.getRefreshRate());
        System.out.println(screen1.getResolution());
        System.out.println(screen1.getResponseTime());
    }
}
