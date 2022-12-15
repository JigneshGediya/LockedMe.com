Background of the problem statement:

Company Lockers Pvt. Ltd. hired you as a Full Stack Developer. They aim to digitize their products and chose LockedMe.com as their first project to start with. You’re asked to develop a prototype of the application. The prototype of the application will be then presented to the relevant stakeholders for the budget approval. Your manager has set up a meeting where you’re asked to present the following in the next 15 working days (3 weeks): 

Specification document - Product’s capabilities, appearance, and user interactions

Number and duration of sprints required 

Setting up Git and GitHub account to store and track your enhancements of the prototype 

Java concepts being used in the project 

Data Structures where sorting and searching techniques are used. 

Generic features and three operations: 

Retrieving the file names in an ascending order

Business-level operations:

Option to add a user specified file to the application

Option to delete a user specified file from the application

Option to search a user specified file from the application

Navigation option to close the current execution context and return to the main context

Option to close the application

 

The goal of the company is to deliver a high-end quality product as early as possible. 
 

The flow and features of the application:

Plan more than two sprints to complete the application

Document the flow of the application and prepare a flow chart 

List the core concepts and algorithms being used to complete this application

Code to display the welcome screen. It should display:

Application name and the developer details 

The details of the user interface such as options displaying the user interaction information 

Features to accept the user input to select one of the options listed 

The first option should return the current file names in ascending order. The root directory can be either empty or contain few files or folders in it

 The second option should return the details of the user interface such as options displaying the following:

Add a file to the existing directory list

You can ignore the case sensitivity of the file names 

Delete a user specified file from the existing directory list

You can add the case sensitivity on the file name in order to ensure that the right file is deleted from the directory list

Return a message if FNF (File not found)

Search a user specified file from the main directory

You can add the case sensitivity on the file name to retrieve the correct file

Display the result upon successful operation

Display the result upon unsuccessful operation

Option to navigate back to the main context

There should be a third option to close the application

Implement the appropriate concepts such as exceptions, collections, and sorting techniques for source code optimization and increased performance 


 

You must use the following:

Eclipse/IntelliJ: An IDE to code for the application 

Java: A programming language to develop the prototype 

Git: To connect and push files from the local system to GitHub 

GitHub: To store the application code and track its versions 

Scrum: An efficient agile framework to deliver the product incrementally 

Search and Sort techniques: Data structures used for the project 

Specification document: Any open-source document or Google Docs 


 

Following requirements should be met:

The source code should be pushed to your GitHub repository. You need to document the steps and write the algorithms in it.

The submission of your GitHub repository link is mandatory. In order to track your task, you need to share the link of the repository. You can add a section in your document. 

Document the step-by-step process starting from sprint planning to the product release. 

Application should not close, exit, or throw an exception if the user specifies an invalid input.

You need to submit the final specification document which includes: 

Project and developer details 

Sprints planned and the tasks achieved in them 

Algorithms and flowcharts of the application 

Core concepts used in the project 

Links to the GitHub repository to verify the project completion 

Your conclusion on enhancing the application and defining the USPs (Unique Selling Points)




Lockedme.com
Project Details: -
	This application enables users to explore, create, search and delete file from the directory. 
	This can be the file manager application for reading and editing. 
Developer Details: -
	Name: - Jigneshkumar Gediya
	Position: - Jr. Developer
	Role: - Full Stack JAVA Developer 

Sprint Planning: -
Total 3 sprint will be required to complete the application.
	Phase – 1: - Create user interaction such a way like options for user input to select specific operation
	Result
	Display Main Menu
1.	View the list of existing files
2.	Manage Files [ Menu]
3.	Exit
	Display Manage Files Menu
1.	Add A File
2.	Delete A File
3.	Search A File
4.	Return To Main Menu
	Phase – 2:  - Create file management operation to handle user input of Manage files menu
	Result
1.	addFile()
2.	deleteFile()
3.	searchFile()
	Phase – 3:  - Create execution method to display existing files in ascending order

Algorithm: -

Main Class (Main.java)
	Main class contains method appInfo() to print the application details
userInteraction Class (userInteraction.java)
	mainMenu() - Generic features and three operations:
•	Retrieving the file names in an ascending order
•	Business-level operations manageFilesMenu() -
	Option to add a user specified file to the application
	Option to delete a user specified file from the application
	Option to search a user specified file from the application
•	Navigation option to close the current execution context and return to the main context
•	Option to close the application
	userConsole()
•	Calls functions mainMenu() and managefilesMenu()
•	Switch control flow to handle the operations based on user’s specified input.

Business Level Operations handler Class (BusinessLevelOperation.java)
	addFile() - adds user specified file to fileStorage directory within the application.
•	Uses createNewFile() method from class File.
•	Exception handling used - IOException.
	deleteFile() - deletes user specified file to fileStorage directory within the application.
•	Uses delete() method from class File.
	searchFile() - search for the existence of user specified file in fileStorage directory within the application.
•	Uses linear search algorithm to compare the user specified file name with elements in the list of files existing in the fileStorage directory.

File viewer class (fileViewer.java)
	getFilesList()
•	retrieves list of files in the fileStorage directory in the application.
•	use Collections.sort() to sort the files in ascending order.
•	prints the list of files that exists.

Flowchart: -
 
Core Concepts Used: -
	Scanner class for scanning user specified inputs
	Data Structure - Array, List and Collections
	Control flow - using switch, if-else, do-while methodologies
	Exception handling - FileNotFoundException, IOException
	File Handling - for creating and deleting file
	Linear Search Algorithm
	Encapsulation in OOPS


Links to the GitHub repository: - 
https://github.com/JigneshGediya/LockedMe.com

IDE and SDK Specification: -
	IDE: - Eclipse IDE 2022‑12
	SDK: -java 18.0.1.1 2022-04-22

Folder and File Structure: -
	Lockedme.com

	src

•	com.Lockedme

o	Main.java
o	userInteraction.java
o	filesViewer.java
o	BusinessLevelOperation.java

	fileStorage [This folder is for file management using Lockedme.com application.]

•	class.txt
•	student.docs
•	school.pdf
 
Main.java
____________________________________________________________________________
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
 
userInteraction.java
____________________________________________________________________________
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
 
BusinessLevelOperation.java
____________________________________________________________________________
package com.Lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BusinessLevelOperation {

    private  String userDirectory = System.getProperty("user.dir")+ "\\fileStorage\\";
    public void addFile() {

        System.out.println("Enter File Name Which You Want To Add: -");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        File fileObject = new File(userDirectory+ fileName);
        try {
            if(fileObject.createNewFile()) {
                System.out.println(fileName + " file is added to the directory");
            }
            else {
                System.out.println("This file is already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public void deleteFile() {
        System.out.println("Enter the file name you wish to delete:");
        Scanner scan=new Scanner(System.in);
        String fileName = scan.nextLine();

        File F= new File(userDirectory + fileName);
        if(F.delete())
            System.out.println(fileName + " is Deleted!");
        else
            System.out.println("File Not Found");
    }
    public void searchFile() {
            Scanner scan= new Scanner(System.in);
            File directory = new File(userDirectory);
            System.out.println("Enter the file name you need to lookup:");
            String fileName=scan.nextLine();
            String[] files=directory.list();
            int flag=0;
            for (String file : files) {
                if (file.equals(fileName)) {
                    flag=1;
                    System.out.println(file + " File found");
                }
            }
            if(flag==0) {
                System.out.println("File not found");
            }
    }
}


 
filesViewer.java
____________________________________________________________________________
package com.Lockedme;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class filesViewer {
    private List<String> filesList= new ArrayList<String>();
    private String userDirectory = System.getProperty("user.dir") + "\\fileStorage\\";
    private File[] files = new File(userDirectory).listFiles();

    public void getFilesList() {
        for(File file : files) {
            if(file.isFile()) {
                filesList.add(file.getName());
            }
        }
        Collections.sort(filesList);
        filesList.forEach(System.out::println);

    }
}
