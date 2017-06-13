package aliceinnets.util;

import java.lang.reflect.Array;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class TestCaseUtil {
	
	public static void assertArrayElements(Object object, Consumer<Object> assertFunction) {
		if(object.getClass().isArray()) {
			for(int i=0;i<Array.getLength(object);++i) {
				assertArrayElements(Array.get(object, i), assertFunction);
			}
		} else {
			assertFunction.accept(object);
		}
	}
	
	public static void assertArrayElements(String message, Object object, Predicate<Object> predicate, boolean answer) {
		if(object.getClass().isArray()) {
			for(int i=0;i<Array.getLength(object);++i) {
				assertArrayElements(message, Array.get(object, i), predicate, answer);
			}
		} else {
			asserts(message, object, predicate, answer);
		}
	}
	
	public static void asserts(String message, Object object, Predicate<Object> predicate, boolean answer) {
		if(predicate.test(object) != answer) {
			if(message == null) message = String.format("object was %s", object);
			TestCase.fail(message);
		}
	}
	
	public static void assertArrayElements(Object object, Predicate<Object> assertFunction, boolean answer) {
		assertArrayElements(null, object, assertFunction, answer);
	}
	
	public static void asserts(Object object, Predicate<Object> assertFunction) {
		asserts(null, object, assertFunction, true);
	}
	
	public static void assertArrayElements(Object expected, Object actual, BiConsumer<Object, Object> assertFunction) {
		if(actual.getClass().isArray()) {
			if(Array.getLength(expected) != Array.getLength(actual)) {
				throw new AssertionFailedError(String.format("expected.length(%s) != actual.length(%s)", Array.getLength(expected), Array.getLength(actual)));
			}
			for(int i=0;i<Array.getLength(actual);++i) {
				assertArrayElements(Array.get(expected, i), Array.get(actual, i), assertFunction);
			}
		} else {
			assertFunction.accept(expected, actual);
		}
	}
	
	public static void assertArrayElements(String message, Object expected, Object actual, BiPredicate<Object, Object> predicate, boolean answer) {
		if(actual.getClass().isArray()) {
			if(Array.getLength(expected) != Array.getLength(actual)) {
				throw new AssertionFailedError(String.format("expected.length(%s) != actual.length(%s)", Array.getLength(expected), Array.getLength(actual)));
			}
			for(int i=0;i<Array.getLength(actual);++i) {
				assertArrayElements(message, Array.get(expected, i), Array.get(actual, i), predicate, answer);
			}
		} else {
			asserts(message, expected, actual, predicate, answer);
		}
	}
	
	public static void asserts(String message, Object expected, Object actual, BiPredicate<Object, Object> predicate, boolean answer) {
		if(predicate.test(expected, actual) != answer) {
			if(message == null) message = String.format("expected was %s and actual was %s", expected, actual);
			TestCase.fail(message);
		}
	}
	
	public static void assertArrayElements(Object expected, Object actual, BiPredicate<Object, Object> assertFunction, boolean answer) {
		assertArrayElements(null, expected, actual, assertFunction, answer);
	}
	
	public static void asserts(Object expected, Object actual, BiPredicate<Object, Object> assertFunction) {
		asserts(null, expected, actual, assertFunction, true);
	}
	
	public static void assertArrayElementsEquals(Object expected, Object actual) {
		assertArrayElements(expected, actual, TestCase::assertEquals);
	}
	
}
