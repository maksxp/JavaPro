import javax.xml.bind.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        Trains trains = new Trains();
        File file = new File("train.xml");
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance (Trains.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            trains = (Trains) unmarshaller.unmarshal (file);
            System.out.println(trains);
        }
        catch (JAXBException e){
            System.out.println(e);
        }
        trains.chooseTime("15:00","19:00");
        trains.addTrain(new Train("Kyiv", "Odessa", "19.12.2013", "16:00"));
        System.out.println(trains);
       trains.chooseTime("15:00","19:00");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance (Trains.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(trains, file);
            marshaller.marshal(trains, System.out);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            trains = (Trains) unmarshaller.unmarshal (file);
            System.out.println(trains);
        }
        catch (JAXBException e){
            System.out.println(e);
        }
        trains.addTrain(new Train("Dnepr", "Kharkiv", "19.12.2013", "18:00"));
        System.out.println(trains);
        trains.chooseTime("15:00","19:00");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance (Trains.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(trains, file);
            marshaller.marshal(trains, System.out);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            trains = (Trains) unmarshaller.unmarshal (file);
            System.out.println(trains);
        }
        catch (JAXBException e){
            System.out.println(e);
        }
    }
}
