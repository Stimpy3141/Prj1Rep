package prj1Pkg;

public class GroceryItem {
	private int quantity;
	private String units;
	
	public GroceryItem(){
		this.setQuantity(0);
		this.setUnits(null);
	}
	
	public GroceryItem(int aQuantityVal, String aUnitsVal){
		this.setQuantity(aQuantityVal);
		this.setUnits(aUnitsVal);
	}	
	
	public GroceryItem(GroceryItem aGroceryItem){
		this.setQuantity(aGroceryItem.getQuantity());
		this.setUnits(aGroceryItem.getUnits());
	}
	
	public void setQuantity(int aQuantityVal){
		this.quantity = aQuantityVal;
	}
	
	public void setUnits(String aUnitsVal){
		this.units = aUnitsVal;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public String getUnits(){
		return this.units;
	}
	
	@Override
	public String toString(){
		return "Quantity: " + this.getQuantity() + ", " + "Units: " + this.getUnits();
	}
	
	
}
