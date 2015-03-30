package core.ref;

import java.lang.reflect.Method;

import org.junit.Test;

public class Junit3TestRunner {
	@Test
	public <ERIN> void run() throws Exception {
		Class<Junit3Test> clazz = Junit3Test.class;
//		Class<ERIN> clazz = (Class<ERIN>) clazz1.getSuperclass();
		
		Method[] meths = clazz.getDeclaredMethods();
		Method[] meths2 = clazz.getMethods();
		
		System.out.println(meths.length);
		for (Method method : meths) {
			if (!method.getName().startsWith("test")) {
				continue;
			}
			method.invoke(clazz.newInstance());
		}
		for (Method method : meths2) {
			System.out.println(method);
		}

	}
}
