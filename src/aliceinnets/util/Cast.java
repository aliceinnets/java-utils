package aliceinnets.util;



public class Cast {	
	public final static double[][] toDouble(int[][] a) {
		double[][] ret = new double[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toDouble(a[i][j]);
		return ret;
	}

	public final static double[] toDouble(int[] a) {
		double[] ret = new double[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toDouble(a[i]);
		return ret;
	}

	public final static double toDouble(int a) {
		return aliceinnets.util.SingleCast.toDouble(a);
	}

	
	public final static double[][] toDouble(short[][] a) {
		double[][] ret = new double[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toDouble(a[i][j]);
		return ret;
	}

	public final static double[] toDouble(short[] a) {
		double[] ret = new double[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toDouble(a[i]);
		return ret;
	}

	public final static double toDouble(short a) {
		return aliceinnets.util.SingleCast.toDouble(a);
	}

	
	public final static double[][] toDouble(byte[][] a) {
		double[][] ret = new double[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toDouble(a[i][j]);
		return ret;
	}

	public final static double[] toDouble(byte[] a) {
		double[] ret = new double[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toDouble(a[i]);
		return ret;
	}

	public final static double toDouble(byte a) {
		return aliceinnets.util.SingleCast.toDouble(a);
	}

	
	public final static double[][] toDouble(long[][] a) {
		double[][] ret = new double[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toDouble(a[i][j]);
		return ret;
	}

	public final static double[] toDouble(long[] a) {
		double[] ret = new double[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toDouble(a[i]);
		return ret;
	}

	public final static double toDouble(long a) {
		return aliceinnets.util.SingleCast.toDouble(a);
	}

	
	public final static double[][] toDouble(float[][] a) {
		double[][] ret = new double[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toDouble(a[i][j]);
		return ret;
	}

	public final static double[] toDouble(float[] a) {
		double[] ret = new double[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toDouble(a[i]);
		return ret;
	}

	public final static double toDouble(float a) {
		return aliceinnets.util.SingleCast.toDouble(a);
	}

	
	public final static float[][] toFloat(short[][] a) {
		float[][] ret = new float[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toFloat(a[i][j]);
		return ret;
	}

	public final static float[] toFloat(short[] a) {
		float[] ret = new float[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toFloat(a[i]);
		return ret;
	}

	public final static float toFloat(short a) {
		return aliceinnets.util.SingleCast.toFloat(a);
	}

	
	public final static float[][] toFloat(int[][] a) {
		float[][] ret = new float[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toFloat(a[i][j]);
		return ret;
	}

	public final static float[] toFloat(int[] a) {
		float[] ret = new float[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toFloat(a[i]);
		return ret;
	}

	public final static float toFloat(int a) {
		return aliceinnets.util.SingleCast.toFloat(a);
	}

	
	public final static float[][] toFloat(byte[][] a) {
		float[][] ret = new float[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toFloat(a[i][j]);
		return ret;
	}

	public final static float[] toFloat(byte[] a) {
		float[] ret = new float[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toFloat(a[i]);
		return ret;
	}

	public final static float toFloat(byte a) {
		return aliceinnets.util.SingleCast.toFloat(a);
	}

	
	public final static float[][] toFloat(long[][] a) {
		float[][] ret = new float[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toFloat(a[i][j]);
		return ret;
	}

	public final static float[] toFloat(long[] a) {
		float[] ret = new float[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toFloat(a[i]);
		return ret;
	}

	public final static float toFloat(long a) {
		return aliceinnets.util.SingleCast.toFloat(a);
	}

	
	public final static float[][] toFloat(double[][] a) {
		float[][] ret = new float[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toFloat(a[i][j]);
		return ret;
	}

	public final static float[] toFloat(double[] a) {
		float[] ret = new float[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toFloat(a[i]);
		return ret;
	}

	public final static float toFloat(double a) {
		return aliceinnets.util.SingleCast.toFloat(a);
	}

	
	public final static long[][] toLong(short[][] a) {
		long[][] ret = new long[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toLong(a[i][j]);
		return ret;
	}

	public final static long[] toLong(short[] a) {
		long[] ret = new long[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toLong(a[i]);
		return ret;
	}

	public final static long toLong(short a) {
		return aliceinnets.util.SingleCast.toLong(a);
	}

	
	public final static long[][] toLong(int[][] a) {
		long[][] ret = new long[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toLong(a[i][j]);
		return ret;
	}

	public final static long[] toLong(int[] a) {
		long[] ret = new long[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toLong(a[i]);
		return ret;
	}

	public final static long toLong(int a) {
		return aliceinnets.util.SingleCast.toLong(a);
	}

	
	public final static long[][] toLong(byte[][] a) {
		long[][] ret = new long[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toLong(a[i][j]);
		return ret;
	}

	public final static long[] toLong(byte[] a) {
		long[] ret = new long[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toLong(a[i]);
		return ret;
	}

	public final static long toLong(byte a) {
		return aliceinnets.util.SingleCast.toLong(a);
	}

	
	public final static long[][] toLong(float[][] a) {
		long[][] ret = new long[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toLong(a[i][j]);
		return ret;
	}

	public final static long[] toLong(float[] a) {
		long[] ret = new long[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toLong(a[i]);
		return ret;
	}

	public final static long toLong(float a) {
		return aliceinnets.util.SingleCast.toLong(a);
	}

	
	public final static long[][] toLong(double[][] a) {
		long[][] ret = new long[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toLong(a[i][j]);
		return ret;
	}

	public final static long[] toLong(double[] a) {
		long[] ret = new long[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toLong(a[i]);
		return ret;
	}

	public final static long toLong(double a) {
		return aliceinnets.util.SingleCast.toLong(a);
	}

	
	public final static int[][] toInt(short[][] a) {
		int[][] ret = new int[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toInt(a[i][j]);
		return ret;
	}

	public final static int[] toInt(short[] a) {
		int[] ret = new int[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toInt(a[i]);
		return ret;
	}

	public final static int toInt(short a) {
		return aliceinnets.util.SingleCast.toInt(a);
	}

	
	public final static int[][] toInt(long[][] a) {
		int[][] ret = new int[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toInt(a[i][j]);
		return ret;
	}

	public final static int[] toInt(long[] a) {
		int[] ret = new int[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toInt(a[i]);
		return ret;
	}

	public final static int toInt(long a) {
		return aliceinnets.util.SingleCast.toInt(a);
	}

	
	public final static int[][] toInt(byte[][] a) {
		int[][] ret = new int[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toInt(a[i][j]);
		return ret;
	}

	public final static int[] toInt(byte[] a) {
		int[] ret = new int[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toInt(a[i]);
		return ret;
	}

	public final static int toInt(byte a) {
		return aliceinnets.util.SingleCast.toInt(a);
	}

	
	public final static int[][] toInt(float[][] a) {
		int[][] ret = new int[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toInt(a[i][j]);
		return ret;
	}

	public final static int[] toInt(float[] a) {
		int[] ret = new int[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toInt(a[i]);
		return ret;
	}

	public final static int toInt(float a) {
		return aliceinnets.util.SingleCast.toInt(a);
	}

	
	public final static int[][] toInt(double[][] a) {
		int[][] ret = new int[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toInt(a[i][j]);
		return ret;
	}

	public final static int[] toInt(double[] a) {
		int[] ret = new int[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toInt(a[i]);
		return ret;
	}

	public final static int toInt(double a) {
		return aliceinnets.util.SingleCast.toInt(a);
	}

	
	public final static short[][] toShort(int[][] a) {
		short[][] ret = new short[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toShort(a[i][j]);
		return ret;
	}

	public final static short[] toShort(int[] a) {
		short[] ret = new short[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toShort(a[i]);
		return ret;
	}

	public final static short toShort(int a) {
		return aliceinnets.util.SingleCast.toShort(a);
	}

	
	public final static short[][] toShort(long[][] a) {
		short[][] ret = new short[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toShort(a[i][j]);
		return ret;
	}

	public final static short[] toShort(long[] a) {
		short[] ret = new short[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toShort(a[i]);
		return ret;
	}

	public final static short toShort(long a) {
		return aliceinnets.util.SingleCast.toShort(a);
	}

	
	public final static short[][] toShort(byte[][] a) {
		short[][] ret = new short[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toShort(a[i][j]);
		return ret;
	}

	public final static short[] toShort(byte[] a) {
		short[] ret = new short[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toShort(a[i]);
		return ret;
	}

	public final static short toShort(byte a) {
		return aliceinnets.util.SingleCast.toShort(a);
	}

	
	public final static short[][] toShort(float[][] a) {
		short[][] ret = new short[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toShort(a[i][j]);
		return ret;
	}

	public final static short[] toShort(float[] a) {
		short[] ret = new short[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toShort(a[i]);
		return ret;
	}

	public final static short toShort(float a) {
		return aliceinnets.util.SingleCast.toShort(a);
	}

	
	public final static short[][] toShort(double[][] a) {
		short[][] ret = new short[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toShort(a[i][j]);
		return ret;
	}

	public final static short[] toShort(double[] a) {
		short[] ret = new short[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toShort(a[i]);
		return ret;
	}

	public final static short toShort(double a) {
		return aliceinnets.util.SingleCast.toShort(a);
	}

	
	public final static byte[][] toByte(int[][] a) {
		byte[][] ret = new byte[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toByte(a[i][j]);
		return ret;
	}

	public final static byte[] toByte(int[] a) {
		byte[] ret = new byte[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toByte(a[i]);
		return ret;
	}

	public final static byte toByte(int a) {
		return aliceinnets.util.SingleCast.toByte(a);
	}

	
	public final static byte[][] toByte(long[][] a) {
		byte[][] ret = new byte[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toByte(a[i][j]);
		return ret;
	}

	public final static byte[] toByte(long[] a) {
		byte[] ret = new byte[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toByte(a[i]);
		return ret;
	}

	public final static byte toByte(long a) {
		return aliceinnets.util.SingleCast.toByte(a);
	}

	
	public final static byte[][] toByte(short[][] a) {
		byte[][] ret = new byte[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toByte(a[i][j]);
		return ret;
	}

	public final static byte[] toByte(short[] a) {
		byte[] ret = new byte[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toByte(a[i]);
		return ret;
	}

	public final static byte toByte(short a) {
		return aliceinnets.util.SingleCast.toByte(a);
	}

	
	public final static byte[][] toByte(float[][] a) {
		byte[][] ret = new byte[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toByte(a[i][j]);
		return ret;
	}

	public final static byte[] toByte(float[] a) {
		byte[] ret = new byte[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toByte(a[i]);
		return ret;
	}

	public final static byte toByte(float a) {
		return aliceinnets.util.SingleCast.toByte(a);
	}

	
	public final static byte[][] toByte(double[][] a) {
		byte[][] ret = new byte[a.length][a[0].length];
		for(int i=0;i<ret.length;++i)
			for(int j=0;j<ret[0].length;++j)
				ret[i][j] = aliceinnets.util.SingleCast.toByte(a[i][j]);
		return ret;
	}

	public final static byte[] toByte(double[] a) {
		byte[] ret = new byte[a.length];
		for(int i=0;i<ret.length;++i)
			ret[i] = aliceinnets.util.SingleCast.toByte(a[i]);
		return ret;
	}

	public final static byte toByte(double a) {
		return aliceinnets.util.SingleCast.toByte(a);
	}

	
	
}