package aliceinnets.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OneLiners {
	
	public final static String getFileName(String pathname) {
		int index = pathname.lastIndexOf(File.separator);
		return pathname.substring(index+1);
	}
	
	
	public final static String getPath(String pathname) {
		int index = pathname.lastIndexOf(File.separator);
		return pathname.substring(0, index+1);
	}
	
	
	public final static String date() {
		return new Date(System.currentTimeMillis()).toString();
	}
	
	
	public final static String date(long currentTimeMillis) {
		return new Date(currentTimeMillis).toString();
	}
	
	
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
	
	
	public final static String[] getFileNames(String dir) {
		File[] directories = getFiles(dir);
		String[] name = new String[directories.length];
		for (int i = 0; i < name.length; i++) {
			name[i] = directories[i].getName();
		}
		
		return name;
	}
	
	
	public final static String[] getFilePaths(String dir) {
		File[] directories = getFiles(dir);
		String[] name = new String[directories.length];
		for (int i = 0; i < name.length; i++) {
			name[i] = directories[i].getPath()+"/";
		}
		
		return name;
	}
	
	
	public final static File[] getFiles(String dir) {
		return new File(dir).listFiles(File::isFile);
	}
	
	
	public final static String[] getSubdirNames(String dir) {
		File[] directories = getSubdirs(dir);
		String[] name = new String[directories.length];
		for (int i = 0; i < name.length; i++) {
			name[i] = directories[i].getName();
		}
		
		return name;
	}
	
	
	public final static String[] getSubdirPaths(String dir) {
		File[] directories = getSubdirs(dir);
		String[] name = new String[directories.length];
		for (int i = 0; i < name.length; i++) {
			name[i] = directories[i].getPath();
		}
		
		return name;
	}
	
	
	public final static File[] getSubdirs(String dir) {
		return new File(dir).listFiles(File::isDirectory);
	}
	
	/**
	 * Extracts the elements in an array based on a boolean array indicating
	 * which elements should be kept.
	 * 
	 * @param array The array to extract elements from.
	 * @param keep if keep[i] == true, the ith elements is kept.
	 * @return A new array with only the chosen elements.
	 */
	public final static Object extractElems(Object array, boolean[] keep) {
		List<Object> ret = new LinkedList<Object>();
		for (int i = 0; i < Array.getLength(array); i++) {
			if(keep[i]) ret.add(Array.get(array, i));
		}
		
		Class<?> type = getElementType(array.getClass());
		try {
			return castToPrimitiveTypeArray(ret.toArray(), type);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Extracts a range of elements (fromIndex:step:toIndex) in an array.
	 * 
	 * @param array The array to extract elements from.
	 * @param fromIndex First index in a to keep.
	 * @param step The step in the sequence of values to be kept
	 * @param toIndex Last index in a to keep.
	 * @return A new array containing the elements with original indices fromIndex:step:toIndex 
	 * 
	 */
	public final static Object extractElems(Object array, int fromIndex, int step, int toIndex) {
		boolean[] keep = new boolean[Array.getLength(array)];
		for(int i=fromIndex;i<=toIndex;i+=step) {
			keep[i] = true;
		}

		return extractElems(array, keep);
	}

	/**
	 * Extracts the elements in an array based on an integer array of indices that should be kept.
	 * 
	 * @param array The array to extract elements from.
	 * @param keepIndicies An array with the indices of the elements of the array a that should
	 * be kept.
	 * @return A new array with only the chosen elements.
	 */
	public final static Object extractElems(Object array, int[] keepIndicies) {
		boolean[] keep = new boolean[keepIndicies.length];
		for (int i = 0; i < keep.length; i++) {
			keep[keepIndicies[i]] = true;
		}

		return extractElems(array, keep);	
	}
	
	
	/**
	 * Clone the non-structured object, so handles primitives, 
	 * object type primitives (e.g. Long), Strings, and arbitrary multidimensional arrays of those types. 
	 * 
	 * @param object non-structured object
	 * @return clone
	 */
	public final static Object cloneNonStructuredObject(Object object) {
		if(!object.getClass().isArray()) {
			return object;
		} else {
			Object ret = Array.newInstance(object.getClass().getComponentType(), Array.getLength(object));
			for(int i=0;i<Array.getLength(object);++i) {
				Array.set(ret, i, cloneNonStructuredObject(Array.get(object, i)));
			}
			return ret;
		}
	}
	
	
	public final static Object castToPrimitiveTypeArray(Object object, Class<?> componentType) throws ClassNotFoundException {
		return castToPrimitiveType(object, getArrayType(componentType, getArrayDimensions(object.getClass())));
	}
	
	
	public final static Object castToPrimitiveType(Object object, Class<?> type) {
		if(!type.isArray()) {
			if(type.equals(double.class) || type.equals(Double.class)) {
				return Double.parseDouble(object.toString());
			} else if(type.equals(float.class)) {
				return Float.parseFloat(object.toString());
			} else if(type.equals(long.class)) {
				return Long.parseLong(object.toString().split("\\.")[0]);
			} else if(type.equals(int.class)) {
				return Integer.parseInt(object.toString().split("\\.")[0]);
			} else if(type.equals(short.class)) {
				return Short.parseShort(object.toString().split("\\.")[0]);
			} else if(type.equals(byte.class)) {
				return Byte.parseByte(object.toString().split("\\.")[0]);
			} else if(type.equals(boolean.class)) {
				return Boolean.parseBoolean(object.toString());
			} else if(type.equals(char.class)) {
				return object.toString().charAt(0);
			} else if(type.equals(String.class)) {
				return object.toString();
			} else {
				throw new RuntimeException(String.format("type to cast(%s) is neither primitive nor string", type));
			}
		} else {
			Object ret = Array.newInstance(type.getComponentType(), Array.getLength(object));
			for(int i=0;i<Array.getLength(object);++i) {
				Array.set(ret, i, castToPrimitiveType(Array.get(object, i), type.getComponentType()));
			}
			return ret;
		}
		
	}
	
	
	public final static int getArrayDimensions(Class<?> type) {
		if(type.getComponentType() == null) {
			return 0;
		} else {
			return getArrayDimensions(type.getComponentType()) + 1;
		}
	}
	
	
	public final static Class<?> getElementType(Class<?> type) {
		if(type.getComponentType() == null) {
			return type;
		} else {
			return getElementType(type.getComponentType());
		}
	}
	
	
	public final static Class<?> getArrayType(Class<?> elementType, int dimension) throws ClassNotFoundException {
		if (dimension == 0) {
			return elementType;
		}
		
		String className = elementType.getName();
		if(className.equals("byte")) { className = "B"; }
		else if(className.equals("char")) { className = "C"; }
		else if(className.equals("double")) { className = "D"; }
		else if(className.equals("float")) { className = "F"; }
		else if(className.equals("int")) { className = "I"; }
		else if(className.equals("long")) { className = "J"; }
		else if(className.equals("short")) { className = "S"; }
		else if(className.equals("boolean")) { className = "Z"; }
		else { className = "L" + className + ";";}
	
		for (int i = 0; i < dimension; i++) {
			className = "[" + className;
		}
	
		return Class.forName(className);
	}
	
	
	public final static void setArrayElement(Object array, Object element, int... indices) {
		if(indices.length == 1) {
			Array.set(array, indices[0], element);
		} else {
			int[] subindices = new int[indices.length-1];
			for(int i=0;i<subindices.length;++i) {
				subindices[i] = indices[i+1];
			}
			
			Object subarray = Array.get(array, indices[0]);
			setArrayElement(subarray, element, subindices);
		}
	}
	
	
	public final static void setArrayElements(Object array, Object[] elements, int[][] indices) {
		if(elements.length != indices.length) {
			throw new RuntimeException(String.format("the dimensions should be same, elements (%s), indices (%s)", elements.length, indices.length));
		}
		for(int i=0;i<elements.length;++i) {
			setArrayElement(array, elements[i], indices[i]);
		}
	}
	
	
	public final static void TextToFile(String fileName, String[] text) {
		OneLiners.mkdirs(fileName);
		
		try{
			FileOutputStream fOut = new FileOutputStream(fileName);
			fOut.write(String.join("\n", text).getBytes());
			fOut.close();
		}catch(IOException err){
			throw new RuntimeException(err);
		}
		
	}
	
	
	public final static int[][] meshGrid(int[]... values) {
		if(values.length == 1) {
			return transpose(values);
		} else {
			int[][] subvalues = new int[values.length-1][];
			for(int i=0;i<subvalues.length;++i) {
				subvalues[i] = values[i+1];
			}
			int[][] subgrid = meshGrid(subvalues);
			
			List<int[]> ret = new LinkedList<int[]>();
			for(int i=0;i<values[0].length;++i) {
				for(int j=0;j<subgrid.length;++j) {
					int[] array = new int[subgrid[0].length+1];
					array[0] = values[0][i];
					for(int k=0;k<subgrid[0].length;++k) {
						array[k+1] = subgrid[j][k];
					}
					ret.add(array);
				}
			}
			return ret.toArray(new int[ret.size()][]);
		}
		
	}
	
	
	public final static int[][] transpose(int dIn[][]){
		int i,j,ni,nj;
		ni = dIn.length;
		if(ni <= 0) return new int[0][0];
		nj = dIn[0].length;
		int dOut[][] = new int[nj][ni];
		for(i=0;i<ni;i++)
			for(j=0;j<nj;j++)
				dOut[j][i]=dIn[i][j];
		
		return dOut;
	}
	
	
	public final static int[] linspaceInt(int x0, int x1, int dx) {
		int n = (int)((x1 - x0)/dx + 1.0);		
		int f[] = new int[n];
		for(int i=0; i<n; i++) {
			f[i] = x0 + i*dx;
		}

		return f;
	}
	
	
	public final static long[] linspaceLong(long x0, long x1, long dx) {
		int n = (int) ((x1 - x0)/dx + 1.0);
		
		long f[] = new long[n];
		for(int i=0; i<n; i++) {
			f[i] = x0 + i*dx;
		}

		return f;
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
