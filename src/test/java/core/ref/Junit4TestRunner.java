package core.ref;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Test;



public class Junit4TestRunner {


	@Test
	public void run() throws Exception {
		Class<Junit4Test> clazz = Junit4Test.class;
//		Annotation[] a =clazz.getAnnotations();
		
		Method[] m = clazz.getDeclaredMethods();
		for (Method method : m) {
			if(method.isAnnotationPresent(MyTest.class)){
				method.invoke(clazz.newInstance());
			}
		} 

	}
}
