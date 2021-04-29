package fr.univrouen.cv21server.model;

/*
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.MarshalException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.ws.http.HTTPException;
import java.io.File;

public class XmlValidator {

    public static void Validate(CV cvi) throws JAXBException {
        try {
            JAXBContext context = JAXBContext.newInstance(CV.class);
            Marshaller marshaller = context.createMarshaller();
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            //Schema schema = sf.newSchema(new StreamSource(new File(XmlValidator.class.getResource("../../../../stb.xsd").getFile())));
            Schema schema = sf.newSchema(new StreamSource(new File("./webapps/restcvi/WEB-INF/stb.xsd")));
            marshaller.setSchema(schema);
            marshaller.setEventHandler(event -> false);
            marshaller.marshal(cvi, System.out);
        }
        catch (SAXException e){
            throw new HTTPException(500);
        }
    }
}
*/