package fr.univ.cv21;

import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.OutputKeys;

public class TransformXSLT {
	
	
	public static void createHTML() throws TransformerException {
		StreamSource xslt = new StreamSource(new File("src/main/resources/cv21.xsl"));
		StreamSource xml = new StreamSource(new File("src/main/resources/cv21-test1.xml"));
		StreamResult result = new StreamResult(new File("src/main/resources/index2.html"));
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    Transformer transformer = transformerFactory.newTransformer( xslt );
	    transformer.setOutputProperty( OutputKeys.ENCODING, "UTF-8" );
	    transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
	    transformer.transform( xml, result );
		System.out.println("Transformation en succés!");
	}
	
	public static void main(String[] args ) {
		try {
			createHTML();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}
}
