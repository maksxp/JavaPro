import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {

        String result = ReadFromFile.readFile("json.txt");
        Gson gson = new GsonBuilder().create();
        Person person = (Person) gson.fromJson(result, Person.class);

             System.out.println("printing parsed person");
        System.out.println(person);
    }
    }

