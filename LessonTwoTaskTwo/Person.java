import java.util.Arrays;

/**
 * Created by mmurza on 04.10.2016.
 */
public class Person {
    public String name;
    public String  surname;
    public String [] phones;
    public String [] sites;
    public Address address;

    @Override
    public String toString() {
        return "Person \n" +
                "name = " + name + "\n"+
                "surname = " + surname + "\n"+
                "phones = " + Arrays.toString(phones) + "\n"+
                "sites = " + Arrays.toString(sites) + "\n"+
                "address " + address
                ;
    }
}
