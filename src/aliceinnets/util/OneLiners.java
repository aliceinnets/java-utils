package aliceinnets.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OneLiners {
	
	public final static String[] exec(String command) {
		try {
			Process process = Runtime.getRuntime().exec(command);
			process.waitFor();
			String input = "";
			String buffer = null;
			BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while ((buffer = inputStreamReader.readLine()) != null) {
				input += buffer+"\n";
			}
			inputStreamReader.close(); 
			
			String error = "";
			BufferedReader errorStreamReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			while ((buffer = errorStreamReader.readLine()) != null) {
				error += buffer+"\n";
			}
			errorStreamReader.close();
			
			process.destroy();
			return new String[] { input, error };
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public final static void println(boolean[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

	public final static void println(byte[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	
	public final static void println(char[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	
	public final static void println(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	
	public final static void println(float[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	
	public final static void println(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	
	public final static void println(long[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	
	public final static void println(Object[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	
	public final static void println(short[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	
	public final static void println(boolean[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	public final static void println(byte[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	public final static void println(char[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	public final static void println(double[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	public final static void println(float[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	public final static void println(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	public final static void println(long[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	public final static void println(Object[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	public final static void println(short[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	
	public final static Class<?> getElementType(Class<?> type) {
		if(type.getComponentType() == null) {
			return type;
		} else {
			return getElementType(type.getComponentType());
		}
	}
	
	
	public final static void rmdirs(String path) {
		File dir = new File(path);
		if(dir.exists()) {
			if(dir.isDirectory()) {
				for (String subpath : dir.list()) {
					rmdirs(path+File.separator+subpath);
				}
			}
			dir.delete();
		}
	}
	
	
	public final static boolean mkdirs(String path) {
		File dir = new File(path);
		if(dir.exists() && !dir.isDirectory()) {
			throw new RuntimeException(String.format("A file is exist already at %s", path));
		} else {
			return dir.mkdirs();
		}
	}
	
	
	public final static String getAbsoluteDir(Class<?> clazz) {
		return clazz.getResource(clazz.getName()+".java").getPath().replace(clazz.getSimpleName()+".java", "");
	}
	
	
	public final static String read(Reader in) {
		Scanner scanner = new Scanner(in);
		scanner.useDelimiter("\\Z");
		
		String s = scanner.next();
		scanner.close();
		
		return s;
	}
	
	
	public final static String read(File file, boolean printStackTrace) {
		try {
			return read(new FileReader(file));
		} catch (FileNotFoundException e) {
			if(printStackTrace) e.printStackTrace();
			return null;
		}
	}
	
	
	public final static String read(File file) {
		return read(file, false);
	}
	
	
	public final static String read(String pathname, boolean printStackTrace) {
		return read(new File(pathname), printStackTrace);
	}
	
	
	public final static String read(String pathname) {
		return read(new File(pathname), false);
	}
	
	
	public final static void write(String s, Writer writer) {
		PrintWriter out = new PrintWriter(writer);
		
		out.write(s);
		out.close();
	}
	
	
	public final static boolean write(String s, File file, boolean printStackTrace) {
		try {
			write(s, new FileWriter(file));
			return true;
		} catch (IOException e) {
			if(printStackTrace) e.printStackTrace();
			return false;
		}
	}
	
	
	public final static boolean write(String s, File file) {
		return write(s, file, false);
	}
	
	
	public final static boolean write(String s, String pathname, boolean printStackTrace) {
		return write(s, new File(pathname), printStackTrace);
	}
	
	
	public final static boolean write(String s, String pathname) {
		return write(s, new File(pathname), false);
	}
	
	
	public final static double[] linspace(double x0, double x1, int n){
		if(n == 1) return new double[]{ (x0+x1)/2 };
        double f[] = new double[n];
        double dx = (x1 - x0)/(n - 1.0);
        for(int i=0; i<n; i++)
        	f[i] = x0 + i*dx;
        return f;
	}
	
	public final static double[][] transpose(double dIn[][]){
		int i,j,ni,nj;
		ni = dIn.length;
		if(ni <= 0)return new double[0][0];
		nj = dIn[0].length;
		double dOut[][] = new double[nj][ni];
		for(i=0;i<ni;i++)
			for(j=0;j<nj;j++)
				dOut[j][i]=dIn[i][j];
		
		return dOut;
	}
	
	public final static double[][] meshGrid(double[]... values) {
		if(values.length == 1) {
			return transpose(values);
		} else {
			double[][] subvalues = new double[values.length-1][];
			for(int i=0;i<subvalues.length;++i) {
				subvalues[i] = values[i+1];
			}
			double[][] subgrid = meshGrid(subvalues);
			
			List<double[]> ret = new LinkedList<double[]>();
			for(int i=0;i<values[0].length;++i) {
				for(int j=0;j<subgrid.length;++j) {
					double[] array = new double[subgrid[0].length+1];
					array[0] = values[0][i];
					for(int k=0;k<subgrid[0].length;++k) {
						array[k+1] = subgrid[j][k];
					}
					ret.add(array);
				}
			}
			return ret.toArray(new double[ret.size()][]);
		}
		
	}
	
	public final static int countWordUsingScanner(String document, String word) {
		return countWordUsingScanner(document, word, false, false, false);
	}
	
	
	public final static int countWordUsingScanner(String document, String word, boolean caseSensitive) {
		return countWordUsingScanner(document, word, caseSensitive, false, false);
	}
	
	
	public final static int countWordUsingScanner(String document, String word, boolean caseSensitive, boolean wholeWord) {
		return countWordUsingScanner(document, word, caseSensitive, wholeWord, false);
	}
	
	/**
	 * Counting the word in the document string using scanner. It is slower than {@link #countWord} method.
	 * 
	 * @param document
	 * @param word
	 * @param caseSensitive
	 * @param wholeWord
	 * @param excludeNonWordChars
	 * @return number of occurrences of the word in the document
	 */
	public final static int countWordUsingScanner(String document, String word, boolean caseSensitive, boolean wholeWord, boolean excludeNonWordChars) {
		int count = 0;
		
		if(!caseSensitive) document = document.toLowerCase();
		if(excludeNonWordChars) word = word.replaceAll("\\W", "");
		
		Scanner scanner = new Scanner(document);
		if(wholeWord) {
			if(excludeNonWordChars) {
				while(scanner.hasNext()) if(scanner.next().equals(word)) ++count;
			} else {
				while(scanner.hasNext()) if(scanner.next().replaceAll("\\W", "").equals(word)) ++count;
			}
		} else {
			if(excludeNonWordChars) {
				while(scanner.hasNext()) if(scanner.next().contains(word)) ++count;
			} else {
				while(scanner.hasNext()) if(scanner.next().replaceAll("\\W", "").contains(word)) ++count;
			}
			
		}
		scanner.close();
		
		return count;
	}
	
	
	public final static int[] countWords(String document, String[] words) {
		return countWords(document, words, false, false, false);
	}
	
	
	public final static int[] countWords(String document, String[] words, boolean caseSensitive) {
		return countWords(document, words, caseSensitive, false, false);
	}
	
	
	public final static int[] countWords(String document, String[] words, boolean caseSensitive, boolean wholeWord) {
		return countWords(document, words, caseSensitive, wholeWord, false);
	}
	
	
	public final static int[] countWords(String document, String[] words, boolean caseSensitive, boolean wholeWord, boolean excludeNonWordChars) {
		int[] wordCounts = new int[words.length];
		for(int i=0;i<wordCounts.length;++i) {
			wordCounts[i] = countWord(document, words[i], caseSensitive, wholeWord, excludeNonWordChars);
		}
		return wordCounts;
	}
	
	
	public final static int countWord(String document, String word) {
		return countWord(document, word, false, false, false);
	}
	
	
	public final static int countWord(String document, String word, boolean caseSensitive) {
		return countWord(document, word, caseSensitive, false, false);
	}
	
	
	public final static int countWord(String document, String word, boolean caseSensitive, boolean wholeWord) {
		return countWord(document, word, caseSensitive, wholeWord, false);
	}
	
	/**
	 * Counting the word in the document string.
	 * 
	 * @param document
	 * @param word
	 * @param caseSensitive
	 * @param wholeWord
	 * @param excludeNonWordChars
	 * @return number of occurrences of the word in the document
	 */
	public final static int countWord(String document, String word, boolean caseSensitive, boolean wholeWord, boolean excludeNonWordChars) {
		int count = 0;
		
		if(!caseSensitive) document = document.toLowerCase();
		
		String[] words = document.split("\\s+");
		if(wholeWord) {
			if(excludeNonWordChars) {
				for(int i=0;i<words.length;++i) if(words[i].replaceAll("\\W", "").equals(word)) ++count;
			} else {
				for(int i=0;i<words.length;++i) if(words[i].equals(word)) ++count;
			}
		} else {
			if(excludeNonWordChars) {
				for(int i=0;i<words.length;++i) if(words[i].replaceAll("\\W", "").contains(word)) ++count;
			} else {
				for(int i=0;i<words.length;++i) if(words[i].contains(word)) ++count;
			}
			
		}
		
		return count;
	}

}
