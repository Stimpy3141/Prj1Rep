package prj1Pkg;
import java.util.ArrayList;

public class GroceryItems {
	private ArrayList<GroceryItem> itemsAryList;
	
	public GroceryItems(){
		itemsAryList = new ArrayList();		
	}
	
	public GroceryItems(ArrayList<GroceryItem> anotherGroceryItemsList){
		itemsAryList = new ArrayList();
		this.itemsAryList.addAll(anotherGroceryItemsList);
	}
	
	public GroceryItems(GroceryItems aGroceryItemsObject){
		itemsAryList = new ArrayList();
		this.itemsAryList.addAll(aGroceryItemsObject.getGroceryItemsList());
	}	
	
	public ArrayList<GroceryItem> getGroceryItemsList(){
		return this.itemsAryList;
	}
	
	public void addGroceryItem(GroceryItem aGroceryItem){
		this.itemsAryList.add(aGroceryItem);
	}

	
	
}
