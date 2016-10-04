import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mmurza on 03.10.2016.
 */
@XmlRootElement (name="train")
public class Train {
    private int id;
    private String from;
    private String to;
    private String date;
    private String departure;

    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public Train() {

    }

    public Train(String from, String to, String date, String departure) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
         }

    @Override
    public String toString() {
        return "Train{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                ", departure=" + departure +
                '}';
    }
    @XmlElement
    public void setFrom(String from) {
        this.from = from;
    }
    @XmlElement
    public void setTo(String to) {
        this.to = to;
    }
    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }
    @XmlElement
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDate() {
        return date;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDeparture() {
        return departure;
    }
}