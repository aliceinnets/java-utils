package aliceinnets.util;

import junit.framework.TestCase;

public class TestCast extends TestCase {
	
	public void testCast() {
		double[] a = new double[] { 1.0, 2.0, 3.0, 4.0 };
		int[] b = Cast.toInt(a);
		
		for (int i = 0; i < a.length; i++) {
			TestCase.assertEquals((int) a[i], b[i]);
			TestCase.assertNotSame(a[i], b[i]);
		}
	}

}
