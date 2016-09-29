import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SaveTo (path = "d:\\test\\file.txt") 
public class TextContainer {
static String str = "for save";
@Saver
public static void save(String path) {
	try(  PrintWriter out = new PrintWriter( path )  ){
	    out.println( str);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
