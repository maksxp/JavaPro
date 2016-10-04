import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by mmurza on 03.10.2016.
 */
@XmlRootElement(name="trains")
public class Trains {
    private static SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
    @XmlElement (name="train")
    private List<Train> trains = new ArrayList<>();
    public void addTrain (Train train){
        int id = trains.size();
        train.setId(++id);
        trains.add(train);
    }
    @Override
    public String toString (){
        return Arrays.deepToString(trains.toArray());
    }
    private Date stringToDate (String origin){
        Date time=null;
        try {
            time = formatter.parse(origin);
            return time;}
        catch (ParseException e) {
            e.printStackTrace();
            System.out.println("please input time in format hh:mm");
        }
        return time;
    }
    public void chooseTime (String from, String till){
        System.out.println("suitable trains are: ");
        for (Train train: trains){
            if ((stringToDate(from).before(stringToDate(train.getDeparture())))&&((stringToDate(till).after(stringToDate(train.getDeparture())))))
                System.out.println(train);

        }
    }
}
