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

public abstract class Product implements Item, Comparable<Product> {

    /* Step 3: Create an abstract type called Product that will implement the Item interface. Product will implement
     * the basic functionality that all items on a production line should have. Add the following fields to Product:
     * int serialNumber
     * String manufacturer
     * Date manufacuredOn
     * String name
     */

    protected int serialNumber;
    protected String manufacturer = Item.manufacturer;
    protected Date manufacturedOn;
    protected String name;
    static int currentProductNumber = 1;

    // complete the methods from the interface Item

	public Product() {
		
		this.name = "Default";
		this.manufacturer = "OracleProduction";
		this.serialNumber = currentProductNumber++;
		this.manufacturedOn = new Date();
		
	}
	
	public Product(String N) {
		
		this.name = N;
		this.manufacturer = "OracleProduction";
		this.serialNumber = currentProductNumber++;
		manufacturedOn = new Date();
		
	}

    @Override
    public void setProductionNumber(int serialNumber) {

        // the method from interface is overridden  with new methods in the abstract
        // the parameter input is assigned to the abstract declared variables

        // assigns production number to current item
        currentProductionNumber = serialNumber;

    }

    @Override
    public void setName(String name) {

        // interface method overridden with current code
        // assigns name to product, but does not print
        this.name = name;
    }

    @Override
    public String getName() {

        // interface method overridden with current code
        // returns the string set by method setName()
        return this.name;
    }

    @Override
    public Date getManufactureDate() {

        // interface method overridden with current code
        // sets current Date to manufacturing Date
        // manufacturedOn = curDate;
        return manufacturedOn;

    }

    @Override
    public int getSerialNumber() {

        // interface method overridden with current code
        // sets current serial number to serialNumber
        return serialNumber;

    }


    @Override
    public String toString() {

   /* Add a toString method that will return the following: (example data shown).
    Manufacturer : OraclProduction
    Serial Number : 1
    Date : Thu May 14 15:18:43 BST 2015
    Name : Product Name */

        return "Manufacturer  : " + manufacturer + "\n"
                + " Serial Number : " + serialNumber + "\n"
                + " Date          : " + manufacturedOn + "\n"
                + " Name          : " + name + "\n";
    }

    /* currently omitted to remove errors
    @Override
    public int compareTo(Production product1){

        this.name.compareTo(product1.getName());
        int result = this.name.compareTo(product1.getName());
        return result;

    } */


}
