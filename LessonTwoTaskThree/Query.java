import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "query")
public class Query {
    @XmlAttribute (name="yahoo:count")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String count;
    @XmlAttribute (name="yahoo:created")
    private String created;
    @XmlAttribute (name="yahoo:lang")
    private String lang;
    @XmlElement
    private Results results;
    @Override
    public String toString() {
        return "Query{" +
                "count=" + count +
                ", created='" + created + '\'' +
                ", lang='" + lang + '\'' +
                ", results=" + results +
                '}';
    }
}
