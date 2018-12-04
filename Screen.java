/* Juan Ariza
 * COP 3003 Fall 2018
 * JP Project
 *
 * This project is based on the "OraclProduction" sample project
 * Each file and its contents are specified by the project requirements
 *
 * File: Screen.java
 * Purpose: creates class to control screen settings
 *
 * Copyright © 2015, Oracle
 */

package sample;

public class Screen implements ScreenSpec {

  // JP Project Step 9
  // Create a class called Screen that implements ScreenSpec. Add three fields
  // String resolution
  // int refreshrate
  // int responsetime

  private String resolution;
  private int refreshRate;
  private int responseTime;

  Screen() {
    resolution = "1920x1080";
    refreshRate = 60;
    responseTime = 5;
  }

  Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }
  
  // Complete the methods from the ScreenSpec interface
  @Override
  public String getResolution() {
    return resolution;

  }

  @Override
  public int getRefreshRate() {
    return refreshRate;
  }

  @Override
  public int getResponseTime() {
    return responseTime;
  }

  // Add a toString method that will return the details of the 3 field in the same
  // format as the Product Class
  @Override
  public String toString() {

    return "Resolution  : " + resolution + "\n"
        + " Refresh Rate : " + refreshRate + "\n"
        + " Response Time : " + responseTime + "\n";
  }

}