/* Juan Ariza
 * COP 3003 Fall 2018
 * JP Project
 *
 * This project is based on the "OraclProduction" sample project
 * Each file and its contents are specified by the project requirements
 *
 * File: Product.java
 * Purpose: assigns defined values onto OracleProduction products based on the interface requirements
 *
 * Copyright © 2015, Oracle
 */

package sample;

import java.util.Date;

public abstract class Product implements Item {

    /* Step 3: Create an abstract type called Product that will implement the Item interface. Product will implement
     * the basic functionality that all items on a production line should have. Add the following fields to Product:
     * int serialNumber
     * String manufacturer
     * Date manufacuredOn
     * String name
     */

    int serialNumber;
    String manufacturer;
    Date manufacturedOn;
    String name;

    // Add an integer class variable called currentProductionNumber.
    // This will store the next number to be assigned to serialNumber. This will store the next
    // number to be assigned to serialNumber.

    private int currentProductNumber;

    // complete the methods from the interface Item

    @Override
    public void setProductionNumber(int proNum) {

        // the method from interface is overridden  with new methods in the abstract
        // the parameter input is assigned to the abstract declared variables

        // assigns production number to current item
        serialNumber = proNum;
        currentProductNumber = proNum;

    }

    @Override
    public void setName(String proName) {

        // interface method overridden with current code
        // assigns name to product, but does not print
        name = proName;
    }

    @Override
    public String getName() {

        // interface method overridden with current code
        // returns the string set by method setName()
        return name;
    }

    @Override
    public Date getManufactureDate(Date curDate) {

        // interface method overridden with current code
        // sets current Date to manufacturing Date
        // manufacturedOn = curDate;
        return manufacturedOn;

    }

    @Override
    public int getSerialNumber(int proSerial) {

        // interface method overridden with current code
        // sets current serial number to serialNumber
        serialNumber = proSerial;
        return serialNumber;

    }

    void Product(String newName) {

        /* Add a constructor that will take in the name of the product and set this to the
         * field variable name. You will also assign a serial number from the
         * currentProductionNumber. The currentProductionNumber
         * should be incremented in readiness for the next instance.
         * Set manufacturedOn as the current date and time. */
        name = newName;
        serialNumber = currentProductNumber++;
        manufacturedOn = new Date();


    }

    @Override
    public String toString() {

   /* Add a toString method that will return the following: (example data shown).
    Manufacturer : OraclProduction
    Serial Number : 1
    Date : Thu May 14 15:18:43 BST 2015
    Name : Product Name */

        return "Manufacturer  : " + manufacturer + "\n"
                + " Serial Number : " + currentProductNumber + "\n"
                + " Date          : " + manufacturedOn + "\n"
                + " Name          : " + name + "\n";
    }

}
