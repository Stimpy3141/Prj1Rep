/**FILE: GroceryItem.java
 * @author Steve Simpson, Joseph Trimble
 * COURSE: IT 226
 * ASSIGNMENT: "Project 1"
 * DUE DATE: 10/20/2014 11:55pm
 */

package prj1Pkg;

/********************************************************************************************
class definition GroceryItem:
Class that models a single grocery item, as defined in Project 1.
This class provides three constructors, as well as getters and setters for each of the
  item name, item quantity, and item units attributes of GroceryItem objects.
This class also overloads the toString() method.
NOTE: This class does NOT convert the value of quantity to integer from String.
*********************************************************************************************/	

public class GroceryItem {
	private String name;
	private String quantity;
	private String units;
	
	//Null constructor for GroceryItem objects:
	public GroceryItem(){
		this.setName("");
		this.setQuantity("");
		this.setUnits(null);
	}
	
	//Constructor for GroceryItem that uses initializing attribute values:
	public GroceryItem(String nameString, String aQuantityVal, String aUnitsVal){
		this.setName(nameString);
		this.setQuantity(aQuantityVal);
		this.setUnits(aUnitsVal);
	}	
	
	//Constructor for GroceryItem that uses an existing GroceryItem:
	public GroceryItem(GroceryItem aGroceryItem){
		this.setName(aGroceryItem.getName());
		this.setQuantity(aGroceryItem.getQuantity());
		this.setUnits(aGroceryItem.getUnits());
	}
	
	//Setter method for a GroceryItem object's name attribute:
	public void setName(String nameString){	
		this.name = nameString;
	}
	
	//Setter method for a GroceryItem object's quantity attribute:
	public void setQuantity(String aQuantityVal){
		this.quantity = aQuantityVal;
	}
	
	//Setter method for a GroceryItem object's units attribute:
	public void setUnits(String aUnitsVal){
		this.units = aUnitsVal;
	}
	
	//Getter method for a GroceryItem object's name attribute:
	public String getName(){
		return this.name;
	}

	//Getter method for a GroceryItem object's quantity attribute:
	public String getQuantity(){
		return this.quantity;
	}
	
	//Getter method for a GroceryItem object's units attribute:
	public String getUnits(){
		return this.units;
	}
	
	@Override
	//Overridden toString method:
	public String toString(){
		return "Item: " + this.getName() + ", " + "Quantity: " + this.getQuantity() + ", " + "Units: " + this.getUnits();
	}
	
	
}
