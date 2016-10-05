import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadFromFile {

    public static String readFile(String filename) 	{
        String content = null;
        File file = new File(filename);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            //  e.printStackTrace();
            System.out.println("file not found");
        } finally {
            if(reader !=null){try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("can't close");
            }}
        }
        return content;
    }

}
