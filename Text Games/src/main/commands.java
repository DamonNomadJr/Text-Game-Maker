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

import java.util.Scanner;

public class commands {
	// Scanner which will be used to input data from user
	private static Scanner s = new Scanner(System.in);
	// InputString contains the very last input of the user
	private static String InputString = null;
	// Constructor "empty"
	public void Commands(){
		// empty by default
	}
	
	/*
	 *  Takes a path input from a user and returns it as a string. It does
	 *  not processes the string.
	 */
	public static String filePathReader(){
		InputString = s.nextLine();
		System.out.println("input: " + InputString);
		return InputString;
	}
	
	/*
	 * For the command <code>SAY</code> prints out the necessary information
	 * on to the screen.
	 * It cuts out 'say: ' command it self since it is not part of the string
	 * the users want to prompt.
	 */
	public static void sayMethod(String line){
		System.out.println(line.substring(5));
	}
	/*
	 * For the command <code>LISTEN</code> prints out the condition information
	 * on to the screen.
	 * It looks for a String type input from the users.
	 * It stores it as the latest <coe>InputString</code>.
	 * It cuts out 'listen: ' command it self since it is not part of the string
	 * the users want to prompt.
	 */
	public static void listenMethod(String line){
		System.out.println(line.substring(8));
		InputString = s.nextLine();
		System.out.println("input: " + InputString);
	}
	/*
	 * For the command <code>IF</code> process the equality of necessary input
	 * with what is desired
	 * It returns true if <code>InputString</code> is equivalent to what is been
	 * required.
	 */
	public static Boolean ifMethod(String line){
		if (line.substring(4).equals(InputString))
			return true;
		else
			return false;
	}
	/*
	 * For the command <code>SWITCH</code> gives back the partition name that
	 * the program needs to jump to.
	 */
	public static String switchMethod(String line){
		return line.substring(8);
	}
}
