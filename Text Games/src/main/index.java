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

import java.io.*;

public class index {
	// Execution process
	public static void main(String[] args) throws IOException {
		if (fileReader.checkPath()) {
			System.out
					.println("Please type in the file path\n" + "The file should be a text file such as 'myfile.txt'\n"
							+ "The path must be of the following format:\n" + "C:\\folder\\myfile.txt"
									+ "Sample file 'hello.txt");
			System.out.print("File path: ");
			fileReader.setPath(commands.filePathReader());
		}

		String[] myFile = null;
		myFile = fileReader.open();
		System.out.println("Your Code: -------------------------");
		for (int i = 0; i < myFile.length; i++)
			if (myFile[i] != null)
				System.out.println(myFile[i]);
		System.out.println("Begun execution: -------------------------");
		for (int i = 0; i < myFile.length; i++) {
			if (myFile[i].equals("end") || myFile[i].equals(null)) {
				System.out.println("Exiting game.");
				System.exit(0);
			} else if (myFile[i].contains("say: "))
				commands.sayMethod(myFile[i]);
			else if (myFile[i].contains("listen: "))
				commands.listenMethod(myFile[i]);
			else if (myFile[i].contains("if: ")) {
				Boolean bool = commands.ifMethod(myFile[i]);
				if (!bool)
					i++;
			} else if (myFile[i].contains("switch: ")) {
				System.out.println(commands.switchMethod(myFile[i]));
				String Switcher = commands.switchMethod(myFile[i]) + ":";
				for (int a = 0; !myFile[a].equals(Switcher); a++) {
					System.out.println("looking at " + myFile[a] + " == " + Switcher + "?");
					i = a;
				}
			} else if (myFile[i].contains("stage"))
				System.out.print("");
			else {
				System.out.println("Execution error please check your code again.");
				System.exit(0);
			}
		}
	}
}
