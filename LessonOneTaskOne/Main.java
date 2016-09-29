import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args)  {
		
	Class<?> tester = Tester.class;
Method [] methods = tester.getDeclaredMethods();
for (Method method : methods) {
if (method.isAnnotationPresent(MyAnnotation.class)){
	try {
		method.invoke(null, method.getAnnotation(MyAnnotation.class).a(),method.getAnnotation(MyAnnotation.class).b());
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