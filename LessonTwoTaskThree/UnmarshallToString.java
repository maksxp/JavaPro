import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by mmurza on 05.10.2016.
 */
public class UnmarshallToString {
    private static Query xmlAnswer;
    private static SAXParserFactory spf = SAXParserFactory.newInstance();
        public static Query unmarshallToString(String input) {
            try {
             SAXParser sp = spf.newSAXParser();
             XMLReader xr = sp.getXMLReader();

                JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            UnmarshallerHandler unmarshallerHandler = unmarshaller.getUnmarshallerHandler();
            xr.setContentHandler(unmarshallerHandler);
            xr.parse(new InputSource(new StringReader(input)));
            xmlAnswer = (Query) unmarshallerHandler.getResult();
            } catch (JAXBException e) {
            System.out.println(e);
        }
            catch (IOException e) {
                System.out.println(e);
            }
            catch (SAXException e) {
                System.out.println(e);
            }
            catch (ParserConfigurationException e) {
                System.out.println(e);
            }
            return xmlAnswer;
    }
}
