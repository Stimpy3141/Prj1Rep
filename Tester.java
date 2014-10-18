package prj1Pkg;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import java.util.ArrayList;

import org.w3c.dom.NamedNodeMap;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Document workingDoc;
		ArrayList groceryAryList;
		NodeList workingNodeList;
		NodeList workingNodeList2;
		int numItemNodes;
		
		//workingDoc = DOMParserSetup.readXMLFile("C:////Users//Steve//workspace//Project_1//src//prj1Pkg//sample_grocery_list.txt");
		workingDoc = DOMParserSetup.readXMLFile("sample_grocery_list.txt");
		
		Node rootNode = workingDoc.getDocumentElement();
		NodeList allChildNodes = rootNode.getChildNodes();
		
		System.out.println(allChildNodes.getLength());
		
		
		
		//Some root node info for troubleshooting:
		System.out.println(nodeType(rootNode.getNodeType()));
		System.out.println(rootNode.hasAttributes());
		System.out.println(rootNode.getNodeName());
		System.out.println(rootNode.getTextContent().trim());
		System.out.println(rootNode.hasChildNodes());
		System.out.println("$$$$$$$$$$$$$$$$$$");
		System.out.println("");		
		
		/*
		for(int i = 0; i<allChildNodes.getLength(); i++){
			System.out.println(nodeType((allChildNodes.item(i)).getNodeType()));
			System.out.println(allChildNodes.item(i).hasAttributes());
			System.out.println(allChildNodes.item(i).getNodeName());
			System.out.println(allChildNodes.item(i).getTextContent().trim());
			System.out.println("");
		}
		*/
		
		
		for(int i = 0; i<allChildNodes.getLength(); i++){
			//first element is the 'items' element
			if(i==0){
				System.out.println(nodeType((allChildNodes.item(i)).getNodeType()));
				System.out.println(allChildNodes.item(i).hasAttributes());
				System.out.println(allChildNodes.item(i).getNodeName());
				System.out.println(allChildNodes.item(i).getTextContent().trim());
				System.out.println(allChildNodes.item(i).hasChildNodes());
				System.out.println(allChildNodes.item(i).getNodeValue());
				
				System.out.println("-----------------");
				System.out.println("");
			}
			//odd indices refer to 'item' elements:
			else{
				if(i%2 != 0){
					//I THINK this following code block refers to the 'item' element nodes:
					System.out.println(nodeType((allChildNodes.item(i)).getNodeType()));
					System.out.println(allChildNodes.item(i).hasAttributes());
					System.out.println(allChildNodes.item(i).getNodeName());
					//System.out.println(allChildNodes.item(i).getTextContent().trim());
					System.out.println(allChildNodes.item(i).getFirstChild().getNodeValue());
					System.out.println(allChildNodes.item(i).hasChildNodes());
					System.out.println(allChildNodes.item(i).getNodeValue());
					
					System.out.println("+++++++++++++++++++");
					System.out.println("");
				}
				//even indices refer to 'name' elements:
				else{
					//I THINK this following code block refers to the empty text node following the 'item' element node opening tag:..or..
					//I THINK this following code block refers to the 'name' element that is a child of the 'item' element:
					System.out.println(nodeType((allChildNodes.item(i)).getNodeType()));
					System.out.println(allChildNodes.item(i).hasAttributes());
					System.out.println(allChildNodes.item(i).getNodeName());
					//System.out.println(allChildNodes.item(i).getTextContent().trim());
					System.out.println(allChildNodes.item(i).hasChildNodes());
					System.out.println(allChildNodes.item(i).getNodeValue());
					
					System.out.println("**************************");
					System.out.println("");
				}//End inner else
			}//End outer else
			
		}//End loop
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		
		NodeList itemElementNodes = workingDoc.getElementsByTagName("item");
		NamedNodeMap itemAttributeNodes;
		System.out.println(itemElementNodes.getLength());
		
		for(int i = 0; i<itemElementNodes.getLength(); i++){
			System.out.println(nodeType((itemElementNodes.item(i)).getNodeType()));
			System.out.println(itemElementNodes.item(i).hasAttributes());
			System.out.println(itemElementNodes.item(i).getNodeName());
			System.out.println(itemElementNodes.item(i).hasChildNodes());
			System.out.println(itemElementNodes.item(i).getTextContent().trim());
			
			itemAttributeNodes = itemElementNodes.item(i).getAttributes();
			/*
			for(int j = 0; j<itemAttributeNodes.getLength(); j++){
				System.out.println(itemAttributeNodes.item(j).getNodeName());
				System.out.println(itemAttributeNodes.item(j).getNodeValue());				
				System.out.println("@@@@@");
			}
			*/
			System.out.println(itemAttributeNodes.item(0).getNodeName());
			System.out.println(itemAttributeNodes.item(1).getNodeValue());
			
			
			
			
			//System.out.println((itemElementNodes.item(i).getFirstChild()).getNodeValue());
			
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("");
		}//End for loop
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		if(i==4){
			System.out.println("derp   " + (allChildNodes.item(i)).hasChildNodes() + "derp");
			System.out.println(((Text)(allChildNodes.item(i))).getWholeText() + "derp");
			System.out.println("derp   " + (allChildNodes.item(i)).hasAttributes() + "derp");
			System.out.println(((Text)(allChildNodes.item(i))).getTextContent() + "derp");
		}
		*/
	}

	static String nodeType(int type){
		switch(type) {
			case Node.ELEMENT_NODE: return "Element";
			case Node.DOCUMENT_TYPE_NODE: return "Document type";
			case Node.ENTITY_NODE: return "Entity";
			case Node.NOTATION_NODE: return "Notation";
			case Node.TEXT_NODE: return "Text";
			case Node.COMMENT_NODE: return "Comment";
			case Node.CDATA_SECTION_NODE: return "CData section";
			case Node.ATTRIBUTE_NODE: return "Attribute";
			case Node.PROCESSING_INSTRUCTION_NODE: return "Processing instruction";
		}
		return "Unidentified";
	}//End nodeType method
	
	
	
}
