/**FILE: GroceryItems.java
 * @author Steve Simpson, Joseph Trimble
 * COURSE: IT 226
 * ASSIGNMENT: "Project 1"
 * DUE DATE: 10/20/2014 11:55pm
 */

/********************************************************************************************
class definition GroceryItems:
Class that models a set of grocery items.
This class provides three constructors, as well as getters and setters for retrieving setting
  GroceryItem objects to and from this GroceryItems object.
This class also provides the getSize() method to return the number of GroceryItem objects in
  this GroceryItems object.
*********************************************************************************************/

package prj1Pkg;
import java.util.ArrayList;

public class GroceryItems {
	private ArrayList<GroceryItem> itemsAryList;
	
	//null constructor:
	public GroceryItems(){
		itemsAryList = new ArrayList();		
	}
	
	//Constructor that creates a new GroceryItems list from an existing arrayList where each element is a GroceryItem:
	public GroceryItems(ArrayList<GroceryItem> anotherGroceryItemsList){
		itemsAryList = new ArrayList();
		this.itemsAryList.addAll(anotherGroceryItemsList);
	}
	
	//Constructor that creates a new GroceryItems object from an existing GroceryItems object:
	public GroceryItems(GroceryItems aGroceryItemsObject){
		itemsAryList = new ArrayList();
		this.itemsAryList.addAll(aGroceryItemsObject.getGroceryItemsList());
	}	
	
	//Getter method that returns this arraylist of GroceryItems:
	public ArrayList<GroceryItem> getGroceryItemsList(){
		return this.itemsAryList;
	}
	
	//Adds an GroceryItem object to this GroceryItems object:
	public void addGroceryItem(GroceryItem aGroceryItem){
		this.itemsAryList.add(aGroceryItem);
	}

	//Returns the GroceryItem located at indicated index in the GroceryItems list:
	public GroceryItem getGroceryItem(int grocItemIndex){
		return this.getGroceryItemsList().get(grocItemIndex);
	}
	
	//Writes the indicated GroceryItem to the indicated position in the GroceryItems list:
	public void setGroceryItem(int grocItemIndex, GroceryItem someGroceryItem){
		itemsAryList.set(grocItemIndex, someGroceryItem);
	}
	
	//Returns an integer indicating the number of GroceryItem objects in this GroceryItems object:
	public int getSize(){
		return itemsAryList.size();
	}
}
