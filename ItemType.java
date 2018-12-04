/* Juan Ariza
 * COP 3003 Fall 2018
 * JP Project
 *
 * This project is based on the "OraclProduction" sample project
 * Each file and its contents are specified by the project requirements
 *
 * File: ItemType.java
 * Purpose: creates enum for future media labeling use
 *
 * Copyright © 2015, Oracle
 */

package sample;

public enum ItemType {

    // JP Project Step 2: Create an enum called ItemType
    // that will store the following information
    // Audio as AU
    // Visual as VI
    // AudioMobile as AM
    // VisualMobile as VM

    AUDIO("AU"),
    VISUAL("VI"),
    AUDIOMOBILE("AM"),
    VIDEOMOBILE("VM");

    // added code to assign values to enums
    // based on example in Java Enum Tutorial: 10 Examples of Enum in Java
    //
    //Read more: https://javarevisited.blogspot.com/2011/08/enum-in-java-example-tutorial.html#ixzz5SRY0LvWl

    final String keyCode;

    ItemType(String keyCode) {

        this.keyCode = keyCode;
    }
	
	public String getKeyCode() {
		return this.keyCode;
	}

}
