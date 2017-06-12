package aliceinnets.util;

import junit.framework.TestCase;

public class TestUtil extends TestCase {
	
	public void testCasting() {
		double[] a = new double[] { 1.0, 2.0, 3.0, 4.0 };
		int[] b = Util.toInt(a);
		
		for (int i = 0; i < a.length; i++) {
			TestCase.assertEquals((int) a[i], b[i]);
			TestCase.assertNotSame(a[i], b[i]);
		}
	}
	
	public void testPrint() {
		double[][] a = new double[][] { { 1.0, 2.0 }, { 3.0, 4.0 } };
		Util.print(a);
	}

}
