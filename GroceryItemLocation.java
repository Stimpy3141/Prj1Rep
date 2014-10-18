/**FILE: GroceryItemLocation.java
 * @author Steve Simpson, Joseph Trimble
 * COURSE: IT 226
 * ASSIGNMENT: "Project 1"
 * DUE DATE: 10/20/2014 11:55pm
 */

package prj1Pkg;

/********************************************************************************************
class definition GroceryItemLocation:
Class that models a grocery item's location, as defined in Project 1.
This class provides three constructors, as well as getters and setters for each of the
  aisleName and aisleRelativeLocation attributes of GroceryItemLocation objects.
This class also overloads the toString() method.
*********************************************************************************************/	

public class GroceryItemLocation {
	private String aisleName;
	private String aisleRelativeLoc;
	
	//Null Constructor for GroceryItemLocation objects:
	public GroceryItemLocation(){
		this.aisleName = null;
		this.aisleRelativeLoc = null;
	}
	
	//Constructor for GroceryItemLocation objects that uses initializing attribute values:
	public GroceryItemLocation(String anAisleNameVal, String anAisleRelativeLocVal){
		this.setAisleName(anAisleNameVal);
		this.setAisleRelativeLoc(anAisleRelativeLocVal);
	}
	
	//Constructor for GroceryItemLocation objects that uses an existing GroceryItemLocation:
	public GroceryItemLocation(GroceryItemLocation aLocation){
		this.setAisleName(aLocation.getAisleName());
		this.setAisleRelativeLoc(aLocation.getAisleName());
	}
	
	//Setter for the 'aisle name' attribute of GroceryItemLocation objects:
	public void setAisleName(String anAisleName){
		this.aisleName = anAisleName;
	}
	
	//Setter for the 'relative location' attribute of GroceryItemLocation objects:
	public void setAisleRelativeLoc(String anAisleRelativeLoc){
		this.aisleRelativeLoc = anAisleRelativeLoc;
	}
	
	//Getter for the 'aisle name' attribute of GroceryItemLocation objects:
	public String getAisleName(){
		return this.aisleRelativeLoc;
	}
	
	//Getter for the 'relative location' attribute of GroceryItemLocation objects:
	public String getAisleRelativeLoc(){
		return this.aisleRelativeLoc;
	}
	
	@Override
	//Overridden toString method for GroceryItemLocation objects:
	public String toString(){
		return "Aisle name: " + this.getAisleName() + ", " + "Aisle relative location: " + this.getAisleRelativeLoc() + ".";
	}
}//end class GroceryItemLocation
