package com.Lockedme;

import java.io.FileNotFoundException;

public class Main {
	
	public static void appInfo() {
		System.out.println("___________________________________________________");
		System.out.println("|                                                 |");
		System.out.println("|                                                 |");
		System.out.println("|        Application Name: - LockedMe.com         |");
		System.out.println("|        Developed By: - Jignesh Gediya           |");
		System.out.println("|        Version: - 1.0.0.1                       |");
		System.out.println("|                                                 |");
		System.out.println("|_________________________________________________|");
	}
	
	public static void main(String[] args) {
	
		// Application information (Name, Developer)
		appInfo();	
		
		//Display Main Menu 
		userInteraction userConsole = new userInteraction();
		
		try {
			userConsole.userConsole();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}