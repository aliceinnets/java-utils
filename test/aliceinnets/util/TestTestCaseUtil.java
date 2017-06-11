package aliceinnets.util;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class TestTestCaseUtil extends TestCase {
	
	public void testTestCaseUtil() {
		boolean fail;
		double[][] a = new double[][] { { 1.0, 2.0 }, { 3.0, 4.0 } };
		double[][] b = new double[][] { { 1.0, 2.0 }, { 3.0, 4.0 } };
		double[][] c = new double[][] { { 1.0, 2.0 }, { 3.0, 5.0 } };
		
		Object[] aa = new Object[] { "Abel", 2.0 };
		Object[] bb = new Object[] { "Abel", 2.0 };
		Object[] cc = new Object[] { "Cain", 1.0 };
		
		TestCaseUtil.asserts(aa[0], bb[0]::equals);
		
		TestCaseUtil.assertArrayElements(a, b, TestCase::assertEquals);
		TestCaseUtil.assertArrayElementsEquals(a, b);
		fail = false;
		try {
			TestCaseUtil.assertArrayElements(a, c, TestCase::assertEquals);
		} catch (AssertionFailedError ex) {
			fail = true;
		}
		assertTrue(fail);
		fail = false;
		try {
			TestCaseUtil.assertArrayElementsEquals(a, c);
		} catch (AssertionFailedError ex) {
			fail = true;
		}
		assertTrue(fail);
	}

}
