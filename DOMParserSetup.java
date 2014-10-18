/**FILE: DOMParserSetup.java
 * @author Steve Simpson, Joseph Trimble
 * COURSE: IT 226
 * ASSIGNMENT: "Project 1"
 * DUE DATE: 10/20/2014 11:55pm
 */

package prj1Pkg;

/********************************************************************************************
class definition DOMParserStup:
Sets up a DOM XML parser by using the DocumentBuilderFactory and DocumentBuilder classes.
This class provides a static function 'readXMLFile' that the user feeds an XML filename.

NOTE: This class uses the 'setIgnoringElementContentWhitespace() method so that it doesn't
  create extra text nodes in DOM document objects for whitespace characters.
*********************************************************************************************/

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DOMParserSetup {

	//Method to read in an XML file, and create a DOM document from it for parsing.
	public static Document readXMLFile(String filename){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//prevents document objects being created with extra whitespace:
		factory.setIgnoringElementContentWhitespace(true);	
		DocumentBuilder dBuilder = null;
		
			try{
				dBuilder = factory.newDocumentBuilder();
			} catch (ParserConfigurationException pce){
				pce.printStackTrace();
				return null;
			}
		Document doc = null;
		
			try{
				doc = dBuilder.parse(new File(filename));
			} catch (SAXException se){
				se.printStackTrace();
				return null;
			} catch (IOException ioe){
				ioe.printStackTrace();
				return null;
			}
		doc.getDocumentElement().normalize();
	
		return doc;
	}//end readXMLFile
	
}//end DOMParserSetup class
