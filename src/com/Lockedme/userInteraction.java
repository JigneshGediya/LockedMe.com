package com.Lockedme;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class userInteraction {
	// Main-Menu
	public static void mainMenu() {
		 System.out.println("____________________________________________________");
	     System.out.println(" Main Menu:");
	     System.out.println("\t1. View the list of existing file");
	     System.out.println("\t2. File Manager [Add | Delete | Search]");
	     System.out.println("\t3. Quit Locked Me");
	     System.out.println("____________________________________________________");
	     System.out.println("Enter Your Choice in 1 - 3 to Execute The Operation: -");
	}
	//Manage Files Menu
	public static void manageFilesMenu() {
		System.out.println("____________________________________________________");
		 System.out.println("File Manager Menu:");
	     System.out.println("\t1. Add a file");
	     System.out.println("\t2. Delete a file");
	     System.out.println("\t3. Search for a file");
	     System.out.println("\t4. Return to main menu");
	     System.out.println("____________________________________________________");
	     System.out.println("Enter Your Choice in 1 - 4 to Execute The Operation: -");
	}
	//Display Main Menu
	public static void userConsole() throws FileNotFoundException{
		Scanner scanInput = new Scanner(System.in);
		int mainMenuChoice;
		
		do {
			mainMenu();
			mainMenuChoice = scanInput.nextInt();
			BusinessLevelOperation ops = new BusinessLevelOperation();
			switch(mainMenuChoice) {
				case 1:
					filesViewer view = new filesViewer();
                    view.getFilesList();
					break;
				case 2:
					int fileMenuChoice;
					
					do {
						manageFilesMenu();
						fileMenuChoice = scanInput.nextInt();
						switch(fileMenuChoice) {
							case 1:
								ops.addFile();
								break;
							case 2:
								ops.deleteFile();
								break;
							case 3:
								ops.searchFile();
								break;
							case 4:
								System.out.println("Return To Main Menu");
								break;
							default:
								System.out.println(" Invalid Input! Please Retry Correctly...");
						}
						
					} while(fileMenuChoice != 4);
					break;
				case 3:
					System.out.println(" Eixt Application!");
					break;
				default:
					System.out.println(" Invalid Input! Please Retry Correctly...");
					
			}
		
		}while(mainMenuChoice != 3);
	}
}