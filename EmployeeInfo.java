package sample;

import java.util.Scanner;

public class EmployeeInfo {

  // JP Project Step 18
  // The program is required to create an audit trail on its tests of the production line
  // so that it records which employee ran the test. To accomplish this you will need to create
  // a class named EmployeeInfo that will allow the user to input their full name and then create
  // a user id of their first initial and surname

  private StringBuilder name;
  private String code;

  public EmployeeInfo(){
	  setName();
  }
  
  
  public StringBuilder getName() {
	  return name;
  }

  public String getCode() {
	  return code;

  }

  private void setName() {
	  String nameStore = inputName();
	  name = new StringBuilder(nameStore);
	  createEmployeeCode(name);

  }

  private void createEmployeeCode(StringBuilder name) {
	  if(checkName(name)) {
		  code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
	  } else {
		  code = "Guest";
	  }
  }

  private String inputName() {
	  String nameStore;
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Please enter your first and last name: ");
	  nameStore = scan.nextLine();
	  scan.close();
	  return nameStore;

  }

  private boolean checkName(StringBuilder name) {
	  if (name.indexOf(" ") > 0) {
		  return true;
	  } else {
		  return false;
	  }
  }

}