/*
 * York University ThunderBird Group
 * 
 * Alexander Zonta
 * Mehrzad Bazhdanzadeh
 * Lauren Thornton
 * Sherry Innocent
 * 
 * Class made specifically for TextGame engine and is to be used for 
 * research purposes.
 * 
 */
package main;

//"D:\\Team\\Text Games\\hello.txt"
import java.io.*;

public class fileReader {

	public static String x = "";

	/*
	 * Inputs path information of the users file
	 */
	public static void setPath(String path) {
		x = path;
	}

	/*
	 * Checks if the path is empty or not
	 */
	public static Boolean checkPath() {
		return (x.equals(""));
	}

	/*
	 * Inputs path information of the users file, parse's it and returns a
	 * <code>LIST</code> of all the String lines in the program. try: runs the
	 * process catch: either file path is not correct, or the file cannot be
	 * parsed
	 */
	public static String[] open() {
		// Full path of the file
		String fileName = x;

		// line would contain single lines of text
		String line = null;

		try {
			// FileReader is reading the text file
			FileReader fileReader = new FileReader(fileName);

			// Wrapping FileReader in to BufferedReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String[] z = new String[100];
			int n = 0;
			while ((line = bufferedReader.readLine()) != null) {
				z[n] = line;
				n++;

			}
			// Close file
			bufferedReader.close();
			return z;
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "', invalid path.");
			System.exit(0);
			return null;
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "', file type not right.");
			System.exit(0);
			return null;
		}
	}

}
