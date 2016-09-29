
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
public static void main(String[] args) {
	SaveTo saveTo=null;
	Class<?> cls = TextContainer.class;
	if(cls.isAnnotationPresent(SaveTo.class)){
	saveTo =  cls.getAnnotation(SaveTo.class);
	}
	System.out.println(saveTo);
	Method [] methods = cls.getDeclaredMethods();
	for (Method method : methods) {
		if (method.isAnnotationPresent(Saver.class)){
			try {
				method.invoke(null, saveTo.path());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
}
}
