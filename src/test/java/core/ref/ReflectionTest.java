package core.ref;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import next.model.Question;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReflectionTest {
	private static final Logger logger = LoggerFactory.getLogger(ReflectionTest.class);
	
	@Test
	public void showClass() {
		Class<Question> clazz = Question.class;
		logger.debug(clazz.getName());
		

		
		
		
		logger.debug("******************************************field");
		Field[] f = clazz.getDeclaredFields();
		for (Field field : f) {
			logger.debug(field.getName());
		}
		
		
		logger.debug("******************************************constructor");
		Constructor<?>[] c = clazz.getConstructors();
		for (Constructor<?> constructor : c) {
			logger.debug(constructor.getName());
		}
		
		
		logger.debug("******************************************method");
		Method[] m =clazz.getMethods();
		for (Method method : m) {
			logger.debug(method.getName());
		}
	}
	
}
