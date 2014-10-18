/**FILE: XMLGroceryListParser.java
 * @author Steve Simpson, Joseph Trimble
 * COURSE: IT 226
 * ASSIGNMENT: "Project 1"
 * DUE DATE: 10/20/2014 11:55pm
 */

/********************************************************************************************
class definition XMLGroceryListParser:
Sets up an XML DOM Parser that reads the XML file provided.
This class provides a constructor for creating XML parsers for grocery lists.
This class provides a method 'retrieveGroceryItems() that parses the provided XML document
  and builds GroceryItem objects.  These GroceryItem objects are then added to a
  GroceryItems object, and finally, this object is returned.
*********************************************************************************************/

package prj1Pkg;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;

public class XMLGroceryListParser {
	
	private Document grocListDoc;
	private GroceryItems grocItemsList = new GroceryItems();
	
	//Constructor:
	public XMLGroceryListParser(String grocListXMLFileName){
		grocListDoc = DOMParserSetup.readXMLFile(grocListXMLFileName);
	}//End Constructor	
	
	//Parses an XML grocery items list, builds GroceryItem objects, and then
	//populates a GroceryItems object with GroceryItem objects:
	public GroceryItems retrieveGroceryItems(){
		NodeList itemElementNodes = grocListDoc.getElementsByTagName("item");
		NamedNodeMap itemAttributeNodes;
		//Iterate through or each item:
		for(int i = 0; i<itemElementNodes.getLength(); i++){
			GroceryItem tempGroceryItem = new GroceryItem();
			tempGroceryItem.setName(itemElementNodes.item(i).getTextContent().trim());		
			itemAttributeNodes = itemElementNodes.item(i).getAttributes();
			//Item attributes and values:
			tempGroceryItem.setQuantity(itemAttributeNodes.item(0).getNodeValue());			
			tempGroceryItem.setUnits(itemAttributeNodes.item(1).getNodeValue());
			grocItemsList.addGroceryItem(tempGroceryItem);
		}//End for loop
			
		return grocItemsList;
	}//End retrieveGroceryItems method
	
}//End class XMLGroceryListParser
