package prj1Pkg;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XMLGroceryListParser myParser = new XMLGroceryListParser("sample_grocery_list.txt");
		
		myParser.retrieveGroceryItems();
		
	}

}
