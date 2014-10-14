package prj1Pkg;

public class GroceryItemLocation {
	private String aisleName;
	private String aisleRelativeLoc;
	//private enum REL_LOC_VALS {IN_THE_AISLE, AROUND_THE_AISLE};
	
	public GroceryItemLocation(){
		this.aisleName = null;
		this.aisleRelativeLoc = null;
	}
	
	public GroceryItemLocation(String anAisleNameVal, String anAisleRelativeLocVal){
		this.setAisleName(anAisleNameVal);
		this.setAisleRelativeLoc(anAisleRelativeLocVal);
	}
	
	public GroceryItemLocation(GroceryItemLocation aLocation){
		this.setAisleName(aLocation.getAisleName());
		this.setAisleRelativeLoc(aLocation.getAisleName());
	}
	
	public void setAisleName(String anAisleName){
		this.aisleName = anAisleName;
	}
	
	public void setAisleRelativeLoc(String anAisleRelativeLoc){
		this.aisleRelativeLoc = anAisleRelativeLoc;
	}
	
	public String getAisleName(){
		return this.aisleRelativeLoc;
	}
	
	public String getAisleRelativeLoc(){
		return this.aisleRelativeLoc;
	}
	
	@Override
	public String toString(){
		return "Aisle name: " + this.getAisleName() + ", " + "Aisle relative location: " + this.getAisleRelativeLoc() + ".";
	}
}//end class GroceryItemLocation
