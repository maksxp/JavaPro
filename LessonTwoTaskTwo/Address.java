/**
 * Created by mmurza on 04.10.2016.
 */
public class Address {
    public String country;
    public String city;
    public String street;

    @Override
    public String toString() {
        return
                "{country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
