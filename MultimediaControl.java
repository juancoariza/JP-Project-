/* Juan Ariza
 * COP 3003 Fall 2018
 * JP Project
 *
 * This project is based on the "OraclProduction" sample project
 * Each file and its contents are specified by the project requirements
 *
 * File: MultimediaControl.java
 * Purpose: creates an interface for controlling how a media file behaves
 *
 * Copyright © 2015, Oracle
 */

package sample;

/* JP Project Step 4: All of the items on this production line will have basic media controls.
 * Create an interface called MultimediaControl that will define the following methods:
 * public void play();
 * public void stop();
 * public void previous();
 * public void next();  */

public interface MultimediaControl {

  void play();	// when implemented, the file will play
  void stop();	// when implemented, the file will stop
  void previous();	// when implemented, the program will play the next file
  void next();		// when implemented, the program will play the previous file

}
