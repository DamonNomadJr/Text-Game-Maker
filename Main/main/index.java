package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class index {
	private static  List<String> keyWord = new ArrayList(Arrays.asList("say"));
	private static Scanner s = new Scanner(System.in);
	/*
	 * This Method takes in a line which contains the keyword "SAY" case none sensitive,
	 * and it will print out the message of the developer of the game.
	 */
	public static String say(String P){
		return P.substring(4);
	}
	/*
	 * Returns the value of users input. 
	 */
	public static String input(String P){
		return s.nextLine();
	}
	
	public static String ifStage(String P){
		
	}
	
	
	
	public static void main(String [] args){
		System.out.println(say("say Hello World"));
		System.out.println(input("your message"));
	}
}
