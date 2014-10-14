package prj1Pkg;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GroceryItemLocation one = new GroceryItemLocation();
		System.out.println(one);
		
		GroceryItemLocation two = new GroceryItemLocation("Sauces","In the aisle");
		System.out.println(two);
		
		GroceryItemLocation three = new GroceryItemLocation(two);
		System.out.println(three);
	}

}
