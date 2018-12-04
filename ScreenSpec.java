/* Juan Ariza
 * COP 3003 Fall 2018
 * JP Project
 *
 * This project is based on the "OraclProduction" sample project
 * Each file and its contents are specified by the project requirements
 *
 * File: ScreenSpec.java
 * Purpose: creates interface for screen data
 *
 * Copyright © 2015, Oracle
 */

package sample;

public interface ScreenSpec {

  // JP Project Step 8:
  // Create an interface called ScreenSpec. This will define 3 methods:
  // - public String getResolution();
  // - public int getRefreshRate();
  // - public int getResponseTime();

  String getResolution();

  int getRefreshRate();

  int getResponseTime();


}