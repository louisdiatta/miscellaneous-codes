package com.luwee;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ParseXml {
	
	public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<folder name=\"c\">" +
                    "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                    "</folder>" +
                    "<folder name=\"users\" />" +
                "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
	
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));
        Document document = builder.parse(is);
        NodeList nodeList = document.getElementsByTagName("folder");
		ArrayList<String> folderNames = new ArrayList<String>();
        
        for (int temp = 0; temp < nodeList.getLength(); temp++) {
    		Node nNode = nodeList.item(temp);
    		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
    			Element eElement = (Element) nNode;
    			if(eElement.getAttribute("name").charAt(0) == startingLetter) {
        			folderNames.add(eElement.getAttribute("name"));
    			} 
    		}
    	}
        return folderNames;
    }
    
    
}
