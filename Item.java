/* Juan Ariza
 * COP 3003 Fall 2018
 * JP Project
 *
 * This project is based on the "OraclProduction" sample project
 * Each file and its contents are specified by the project requirements
 *
 * File: Item.Java
 * Purpose: creates interface for naming products in the program
 *
 * Copyright © 2015, Oracle
 */

package sample;

import java.util.Date;

/*
 * JP Project Step 1: Create an interface called Item that will force all classes to
 * implement the following functions:
 * A constant called manufacturer that would be set to “OracleProduction”.
 * A method setProductionNumber that would have one integer parameter
 * A method setName that would have one String parameter
 * A method getName that would return a String
 * A method getManufactureDate that would return a Date
 * A method getSerialNumber that would return an int
 */
public interface Item {

    // all items in an interface must be implemented in any child classes
    String manufacturer = "OracleProduction";

    void setProductionNumber(int productionNumber);  // template for method to assign prod. number to item

    void setName(String name); // template for method to assign name to item

    String getName(); // template for method to get the name of said item

    Date getManufactureDate();  // template for method to get Date of manufacture

    int getSerialNumber(); // template for method to get Serial number of product
}

